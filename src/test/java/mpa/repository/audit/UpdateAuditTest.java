package mpa.repository.audit;

import mpa.audit.config.type.CommandType;
import mpa.audit.config.type.EventType;
import mpa.audit.context.AuditTrail;
import mpa.context.MybatisPersistenceManager;
import mpa.fixture.domain.qualifier.TEST_DB;
import mpa.fixture.domain.test_db.Member;
import mpa.fixture.domain.test_db.repository.MemberRepository;
import mpa.fixture.repository.RepositoryTest;
import mpa.fixture.repository.audit.AuditTestListener;
import mpa.fixture.service.TestMemberService;
import mpa.fixture.transaction.TransactionTestTemplate;
import org.junit.jupiter.api.BeforeAll;
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

    @TEST_DB
    @Autowired
    MemberRepository memberRepository;

    @Autowired
    TestMemberService memberService;

    @Autowired
    MybatisPersistenceManager mybatisPersistenceManager;

    @Autowired
    TransactionTestTemplate transactionTestTemplate;

    AuditTestListener auditTestListener = mock(AuditTestListener.class);


    @BeforeAll
    void prepare() {
        mybatisPersistenceManager.startAuditing();
        mybatisPersistenceManager.registerAuditTrailListener(auditTestListener);
    }


    @Test
    @Transactional
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
            public void then() {
                verify(auditTestListener, times(1)).beforeCommit(auditTrailsArgumentCaptor.capture());
                verify(auditTestListener, times(1)).afterCommit(auditTrailsArgumentCaptor.capture());
                verify(auditTestListener, times(0)).manuallyCommit(anyList());

                List<AuditTrail> auditTrails = auditTrailsArgumentCaptor.getValue();

                assertThat(auditTrails).hasSizeGreaterThan(0);

                AuditTrail auditTrail = auditTrails.get(0);

                assertThat(auditTrail.scope().getName()).isEqualTo("test_db");
                assertThat(auditTrail.command()).isEqualTo(CommandType.UPDATE);
                assertThat(auditTrail.argument().getClass()).isEqualTo(Member.class);
                assertThat(auditTrail.argument()).isEqualTo(member);
                assertThat(auditTrail.tableName()).isEqualTo("MEMBER");
                assertThat(auditTrail.event()).isEqualTo(EventType.TRANSACTION);
                assertThat(auditTrail.idArgument().get("ID")).isEqualTo(String.valueOf(member.getId()));
                assertThat(auditTrail.originData().isEmpty()).isFalse();
                assertThat(auditTrail.originData().getRow(0).getColumn("NAME"))
                        .hasValueSatisfying(column -> assertThat(column.value()).isEqualTo(oldName));
                assertThat(auditTrail.updatedData().isEmpty()).isFalse();
                assertThat(auditTrail.updatedData().getRow(0).getColumn("NAME"))
                        .hasValueSatisfying(column -> assertThat(column.value()).isEqualTo(newName));
                assertThat(auditTrail.updatedTime()).isNotNull();
                assertThat(auditTrail.label()).isEqualTo("update member test");
            }

            @Override
            public void compensate(JdbcTemplate jdbcTemplate) {
                member.setName(oldName);
                memberRepository.update(member);
            }
        });
    }
}
