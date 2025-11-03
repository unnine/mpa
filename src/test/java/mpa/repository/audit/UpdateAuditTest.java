package mpa.repository.audit;

import default$.repository.MemberRepository;
import mpa.audit.AuditTrail;
import mpa.audit.config.type.CommandType;
import mpa.audit.config.type.EventType;
import mpa.audit.event.AuditEventExecutor;
import mpa.context.MybatisPersistenceAssistant;
import mpa.fixture.AuditTestListener;
import default$.Member;
import mpa.fixture.repository.RepositoryTest;
import mpa.fixture.service.TestMemberService;
import mpa.fixture.transaction.TransactionTestTemplate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@RepositoryTest
@DisplayName("update audit")
public class UpdateAuditTest {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    TestMemberService memberService;

    @Autowired
    MybatisPersistenceAssistant mybatisPersistenceAssistant;

    @Autowired
    TransactionTestTemplate transactionTestTemplate;

    AuditTestListener auditTestListener;


    @BeforeEach
    void prepare() {
        mybatisPersistenceAssistant.activateAuditing();

        auditTestListener = mock(AuditTestListener.class);
        mybatisPersistenceAssistant.registerAuditTrailListener(auditTestListener);
    }


    @Test
    void byEntity_updateUser_successAuditing() {
        // given
        ArgumentCaptor<List<AuditTrail>> auditTrailsArgumentCaptor = ArgumentCaptor.forClass(List.class);
        List<Member> members = memberRepository.findAll();
        Member member = members.get(0);
        String oldName = member.getName();
        String newName = "updated Name";

        transactionTestTemplate.run(new TransactionTestTemplate.Runner() {
            @Override
            public void when() {
                member.setName(newName);
                memberService.update(member);
            }

            @Override
            @Transactional
            public void then() {
                verify(auditTestListener, times(1)).beforeCommit(auditTrailsArgumentCaptor.capture());
                verify(auditTestListener, times(1)).afterCommit(auditTrailsArgumentCaptor.capture());
                verify(auditTestListener, times(0)).manuallyCommit(anyList());

                auditTrailsArgumentCaptor.getAllValues().forEach(auditTrails -> {
                    assertThat(auditTrails).hasSizeGreaterThan(0);

                    auditTrails.forEach(auditTrail -> {
                        assertThat(auditTrail.event()).isEqualTo(EventType.TRANSACTION);
                        commonAsserts(auditTrail, member);
                        originDataAsserts(auditTrail, oldName);
                        updateDataAsserts(auditTrail, newName);
                    });
                });
            }

            @Override
            public void compensate(JdbcTemplate jdbcTemplate) {
                member.setName(oldName);
                memberRepository.update(member);
            }
        });
    }


    @Test
    void byManually_updateUser_successAuditing() throws Exception {
        // given
        ArgumentCaptor<List<AuditTrail>> auditTrailsArgumentCaptor = ArgumentCaptor.forClass(List.class);
        List<Member> members = memberRepository.findAll();
        Member member = members.get(0);
        String oldName = member.getName();
        String newName = "updated Name";

        transactionTestTemplate.run(new TransactionTestTemplate.Runner() {
            @Override
            public void when() {
                member.setName(newName);

                AuditEventExecutor executor = mybatisPersistenceAssistant.createAuditEventExecutor()
                        .defaultScope()
                        .label("update member test")
                        .build();

                executor.addEntity(member);

                memberService.update(member);

                executor.execute();
            }

            @Override
            public void then() {
                verify(auditTestListener, times(0)).beforeCommit(anyList());
                verify(auditTestListener, times(0)).afterCommit(anyList());
                verify(auditTestListener, times(1)).manuallyCommit(auditTrailsArgumentCaptor.capture());


                auditTrailsArgumentCaptor.getAllValues().forEach(auditTrails -> {
                    assertThat(auditTrails).hasSizeGreaterThan(0);

                    auditTrails.forEach(auditTrail -> {
                        assertThat(auditTrail.event()).isEqualTo(EventType.MANUALLY);
                        commonAsserts(auditTrail, member);
                        originDataAsserts(auditTrail, oldName);
                        updateDataAsserts(auditTrail, newName);
                    });
                });
            }

            @Override
            public void compensate(JdbcTemplate jdbcTemplate) {
                member.setName(oldName);
                memberRepository.update(member);
            }
        });
    }

    private void commonAsserts(AuditTrail auditTrail, Member member) {
        assertThat(auditTrail.scope().isDefault()).isTrue();
        assertThat(auditTrail.command()).isEqualTo(CommandType.UPDATE);
        assertThat(auditTrail.argument().getClass()).isEqualTo(Member.class);
        assertThat(auditTrail.argument()).isEqualTo(member);
        assertThat(auditTrail.tableName()).isEqualTo("MEMBER");
        assertThat(auditTrail.idArgument().get("ID")).isEqualTo(String.valueOf(member.getId()));
        assertThat(auditTrail.label()).isEqualTo("update member test");
        assertThat(auditTrail.updatedTime()).isNotNull();
    }

    private void originDataAsserts(AuditTrail auditTrail, String oldName) {
        assertThat(auditTrail.originData().isEmpty()).isFalse();
        assertThat(auditTrail.originData().getRow(0).getColumn("NAME"))
                .hasValueSatisfying(column -> assertThat(column.value()).isEqualTo(oldName));
    }

    private void updateDataAsserts(AuditTrail auditTrail, String newName) {
        assertThat(auditTrail.updatedData().isEmpty()).isFalse();
        assertThat(auditTrail.updatedData().getRow(0).getColumn("NAME"))
                .hasValueSatisfying(column -> assertThat(column.value()).isEqualTo(newName));
    }

}
