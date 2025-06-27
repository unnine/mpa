package mpa.repository.audit;

import mpa.audit.config.type.CommandType;
import mpa.audit.config.type.EventType;
import mpa.audit.context.AuditTrail;
import mpa.context.MybatisPersistenceManager;
import mpa.fixture.domain.MemberUtil;
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
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.*;

@RepositoryTest
@DisplayName("insert audit")
public class InsertAuditTest {

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
    void byEntity_createUser_successAuditing() {

        // given
        Member member = MemberUtil.newMember("tester");
        ArgumentCaptor<List<AuditTrail>> auditTrailsArgumentCaptor = ArgumentCaptor.forClass(List.class);

        transactionTestTemplate.run(new TransactionTestTemplate.Runner() {
            @Override
            public void when() {
                memberService.insert(member);
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
                assertThat(auditTrail.command()).isEqualTo(CommandType.INSERT);
                assertThat(auditTrail.argument().getClass()).isEqualTo(Member.class);
                assertThat(auditTrail.argument()).isEqualTo(member);
                assertThat(auditTrail.tableName()).isEqualTo("MEMBER");
                assertThat(auditTrail.event()).isEqualTo(EventType.TRANSACTION);
                assertThat(auditTrail.idArgument().get("ID")).isEqualTo(String.valueOf(member.getId()));
                assertThat(auditTrail.originData().isEmpty()).isTrue();
                assertThat(auditTrail.updatedData().isEmpty()).isFalse();
                assertThat(auditTrail.updatedTime()).isNotNull();
                assertThat(auditTrail.label()).isEqualTo("insert member test");
            }

            @Override
            public void compensate(JdbcTemplate jdbcTemplate) {
                MemberUtil.deleteMember(jdbcTemplate);
            }
        });
    }

}
