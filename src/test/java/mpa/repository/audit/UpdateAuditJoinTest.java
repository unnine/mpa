package mpa.repository.audit;

import default$.Member;
import default$.repository.MemberRepository;
import mpa.audit.AuditTrail;
import mpa.audit.config.type.CommandType;
import mpa.context.MybatisPersistenceAssistant;
import mpa.fixture.AuditTestListener;
import mpa.fixture.TestMemberAuditConfiguration;
import mpa.fixture.repository.RepositoryTest;
import mpa.fixture.service.TestMemberService;
import mpa.fixture.transaction.TransactionTestTemplate;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@RepositoryTest
@Import(TestMemberAuditConfiguration.class)
@DisplayName("update audit with join")
public class UpdateAuditJoinTest {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    TestMemberService memberService;

    @Autowired
    MybatisPersistenceAssistant mybatisPersistenceAssistant;

    @Autowired
    TransactionTestTemplate transactionTestTemplate;

    AuditTestListener auditTestListener = mock(AuditTestListener.class);


    @BeforeAll
    void prepare() {
        mybatisPersistenceAssistant.activateAuditing();
        mybatisPersistenceAssistant.registerAuditTrailListener(auditTestListener);
    }


    @Test
    @Transactional
    void byEntity_updateUser_successChangeValue() {
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
            public void then() {
                verify(auditTestListener, times(1)).beforeCommit(auditTrailsArgumentCaptor.capture());
                verify(auditTestListener, times(1)).afterCommit(auditTrailsArgumentCaptor.capture());
                verify(auditTestListener, times(0)).manuallyCommit(anyList());

                auditTrailsArgumentCaptor.getAllValues().forEach(auditTrails -> {
                    assertThat(auditTrails).hasSizeGreaterThan(0);

                    auditTrails.forEach(auditTrail -> {
                        commonAsserts(auditTrail);
                        originDataAsserts(auditTrail);
                        updateDataAsserts(auditTrail);
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

    private void commonAsserts(AuditTrail auditTrail) {
        assertThat(auditTrail.command()).isEqualTo(CommandType.UPDATE);
        assertThat(auditTrail.argument().getClass()).isEqualTo(Member.class);
        assertThat(auditTrail.updatedTime()).isNotNull();
    }

    private void originDataAsserts(AuditTrail auditTrail) {
        assertThat(auditTrail.originData().isEmpty()).isFalse();
        assertThat(auditTrail.originData().getRow(0).getColumn("EMAIL"))
                .hasValueSatisfying(column -> assertThat(column.value()).isEqualTo("10"));
        assertThat(auditTrail.originData().isEmpty()).isFalse();
        assertThat(auditTrail.originData().getRow(0).getColumn("member_like_count"))
                .hasValueSatisfying(column -> assertThat(column.value()).isEqualTo("10"));
        assertThat(auditTrail.originData().getAdditionalColumns().isEmpty()).isFalse();
        assertThat(auditTrail.originData().getAdditionalColumns().containsKey("member_like_count")).isTrue();
        auditTrail.originData().getAdditionalColumns().get("member_like_count").forEach(column -> {
            assertThat(column.value()).isEqualTo("10");
        });
    }

    private void updateDataAsserts(AuditTrail auditTrail) {
        assertThat(auditTrail.updatedData().isEmpty()).isFalse();
        assertThat(auditTrail.updatedData().getRow(0).getColumn("EMAIL"))
                .hasValueSatisfying(column -> assertThat(column.value()).isEqualTo("10"));
        assertThat(auditTrail.updatedData().getRow(0).getColumn("member_like_count"))
                .hasValueSatisfying(column -> assertThat(column.value()).isEqualTo("10"));
        assertThat(auditTrail.updatedData().getAdditionalColumns().isEmpty()).isFalse();
        assertThat(auditTrail.updatedData().getAdditionalColumns().containsKey("member_like_count")).isTrue();
        auditTrail.updatedData().getAdditionalColumns().get("member_like_count").forEach(column -> {
            assertThat(column.value()).isEqualTo("10");
        });
    }
}
