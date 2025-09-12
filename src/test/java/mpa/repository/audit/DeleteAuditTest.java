package mpa.repository.audit;

import default$.Member;
import default$.repository.MemberRepository;
import mpa.audit.AuditTrail;
import mpa.audit.config.type.CommandType;
import mpa.audit.config.type.EventType;
import mpa.audit.event.AuditEventExecutor;
import mpa.context.MybatisPersistenceAssistant;
import mpa.fixture.AuditTestListener;
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
@DisplayName("delete audit")
public class DeleteAuditTest {

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
        mybatisPersistenceAssistant.startAuditing();

        auditTestListener = mock(AuditTestListener.class);
        mybatisPersistenceAssistant.registerAuditTrailListener(auditTestListener);
    }


    @Test
    void byId_deleteUser_successAuditing() {
        // given
        ArgumentCaptor<List<AuditTrail>> auditTrailsArgumentCaptor = ArgumentCaptor.forClass(List.class);
        List<Member> members = memberRepository.findAll();
        Member member = members.get(0);

        transactionTestTemplate.run(new TransactionTestTemplate.Runner() {
            @Override
            public void when() {
                memberService.delete(member.getId());
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
                    });
                });
            }

            @Override
            public void compensate(JdbcTemplate jdbcTemplate) {
                memberRepository.insert(member);
            }
        });
    }

    @Test
    void byManually_deleteUser_successAuditing() throws Exception {
        // given
        ArgumentCaptor<List<AuditTrail>> auditTrailsArgumentCaptor = ArgumentCaptor.forClass(List.class);
        List<Member> members = memberRepository.findAll();
        Member member = members.get(0);

        transactionTestTemplate.run(new TransactionTestTemplate.Runner() {
            @Override
            public void when() {
                AuditEventExecutor executor = mybatisPersistenceAssistant.createAuditEventExecutor()
                        .defaultScope()
                        .label("delete member test")
                        .build();

                executor.addId(member.getId(), Member.class);

                memberService.delete(member.getId());

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
                    });
                });
            }

            @Override
            public void compensate(JdbcTemplate jdbcTemplate) {
                memberRepository.insert(member);
            }
        });
    }

    private void commonAsserts(AuditTrail auditTrail, Member member) {
        assertThat(auditTrail.scope().isDefault()).isTrue();
        assertThat(auditTrail.command()).isEqualTo(CommandType.DELETE);
        assertThat(auditTrail.argument().getClass()).isEqualTo(Integer.class);
        assertThat(auditTrail.argument()).isEqualTo(member.getId());
        assertThat(auditTrail.tableName()).isEqualTo("MEMBER");
        assertThat(auditTrail.idArgument().get("ID")).isEqualTo(String.valueOf(member.getId()));
        assertThat(auditTrail.originData().isEmpty()).isFalse();
        assertThat(auditTrail.originData().getRow(0).getColumn("NAME"))
                .hasValueSatisfying(column -> assertThat(column.value()).isEqualTo(member.getName()));
        assertThat(auditTrail.updatedData().isEmpty()).isTrue();
        assertThat(auditTrail.updatedTime()).isNotNull();
        assertThat(auditTrail.label()).isEqualTo("delete member test");
    }
}
