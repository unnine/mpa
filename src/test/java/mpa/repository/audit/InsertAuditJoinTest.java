package mpa.repository.audit;

import default$.Member;
import default$.MyLike;
import default$.repository.MemberRepository;
import mpa.audit.AuditTrail;
import mpa.audit.config.type.CommandType;
import mpa.context.MybatisPersistenceAssistant;
import mpa.fixture.AuditTestListener;
import mpa.fixture.TestMemberAuditConfiguration;
import mpa.fixture.domain.MemberUtil;
import mpa.fixture.domain.MyLikeUtil;
import mpa.fixture.repository.RepositoryTest;
import mpa.fixture.service.TestMemberService;
import mpa.fixture.service.TestMyLikeService;
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
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.*;

@RepositoryTest
@Import(TestMemberAuditConfiguration.class)
@DisplayName("insert audit with join")
public class InsertAuditJoinTest {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    TestMemberService memberService;

    @Autowired
    TestMyLikeService likeService;

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
    void byEntity_createUser_successChangeValue() {

        // given
        Member member = MemberUtil.newMember("tester");
        MyLike like = MyLikeUtil.newLike(member.getId(), 10);
        ArgumentCaptor<List<AuditTrail>> auditTrailsArgumentCaptor = ArgumentCaptor.forClass(List.class);

        transactionTestTemplate.run(new TransactionTestTemplate.Runner() {
            @Override
            public void when() {
                memberService.insert(member);
                likeService.insert(like);
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
                        commonAsserts(auditTrail);

                        if ("MEMBER".equals(auditTrail.tableName())) {
                            memberAsserts(auditTrail);
                        }
                        if ("MY_LIKE".equals(auditTrail.tableName())) {
                            myLikeAsserts(auditTrail);
                        }
                    });
                });
            }

            @Override
            public void compensate(JdbcTemplate jdbcTemplate) {
                MyLikeUtil.deleteLike(jdbcTemplate);
                MemberUtil.deleteMember(jdbcTemplate);
            }
        });
    }

    private void commonAsserts(AuditTrail auditTrail) {
        assertThat(auditTrail.command()).isEqualTo(CommandType.INSERT);
        assertThat(auditTrail.originData().isEmpty()).isTrue();
        assertThat(auditTrail.updatedData().isEmpty()).isFalse();
        assertThat(auditTrail.updatedTime()).isNotNull();
    }

    private void memberAsserts(AuditTrail auditTrail) {
        assertThat(auditTrail.argument().getClass()).isEqualTo(Member.class);
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

    private void myLikeAsserts(AuditTrail auditTrail) {
        assertThat(auditTrail.argument().getClass()).isEqualTo(MyLike.class);
        assertThat(auditTrail.updatedData().getRow(0).getColumn("COUNT"))
                .hasValueSatisfying(column -> assertThat(column.value()).isEqualTo("10"));
    }

}
