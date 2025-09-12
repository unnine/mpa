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
@DisplayName("delete audit with join")
public class DeleteAuditJoinTest {

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
        mybatisPersistenceAssistant.startAuditing();
        mybatisPersistenceAssistant.registerAuditTrailListener(auditTestListener);
    }


    @Test
    @Transactional
    void byId_deleteUser_successChangeValue() {
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
            public void then() {
                verify(auditTestListener, times(1)).beforeCommit(auditTrailsArgumentCaptor.capture());
                verify(auditTestListener, times(1)).afterCommit(auditTrailsArgumentCaptor.capture());
                verify(auditTestListener, times(0)).manuallyCommit(anyList());

                auditTrailsArgumentCaptor.getAllValues().forEach(auditTrails -> {
                    assertThat(auditTrails).hasSizeGreaterThan(0);

                    auditTrails.forEach(auditTrail -> {
                        commonAsserts(auditTrail);
                    });
                });
            }

            @Override
            public void compensate(JdbcTemplate jdbcTemplate) {
                memberRepository.insert(member);
            }
        });
    }

    private void commonAsserts(AuditTrail auditTrail) {
        assertThat(auditTrail.command()).isEqualTo(CommandType.DELETE);
        assertThat(auditTrail.argument().getClass()).isEqualTo(Integer.class);
        assertThat(auditTrail.updatedTime()).isNotNull();
        assertThat(auditTrail.originData().isEmpty()).isFalse();
        assertThat(auditTrail.originData().getRow(0).getColumn("EMAIL"))
                .hasValueSatisfying(column -> assertThat(column.value()).isEqualTo("10"));
        assertThat(auditTrail.originData().getRow(0).getColumn("member_like_count"))
                .hasValueSatisfying(column -> assertThat(column.value()).isEqualTo("10"));
        assertThat(auditTrail.originData().getAdditionalColumns().isEmpty()).isFalse();
        assertThat(auditTrail.originData().getAdditionalColumns().containsKey("member_like_count")).isTrue();
        auditTrail.originData().getAdditionalColumns().get("member_like_count").forEach(column -> {
            assertThat(column.value()).isEqualTo("10");
        });
    }
}
