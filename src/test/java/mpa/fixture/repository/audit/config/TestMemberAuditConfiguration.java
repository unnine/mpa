package mpa.fixture.repository.audit.config;

import mpa.audit.config.entity.AuditJoinContext;
import mpa.audit.config.entity.EntityAuditConfigurer;
import mpa.audit.repository.sql.join.JoinDSL;
import mpa.fixture.domain.test_db.Member;
import mpa.fixture.domain.test_db.MyLike;
import mpa.fixture.domain.test_db.repository.MemberDynamicSqlSupport;
import mpa.fixture.domain.test_db.repository.MyLikeDynamicSqlSupport;
import mpa.persistence.context.annotation.ScopeName;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration
@ScopeName("test_db")
public class TestMemberAuditConfiguration implements EntityAuditConfigurer<Member> {

    MemberDynamicSqlSupport.Member member = MemberDynamicSqlSupport.member;
    MyLikeDynamicSqlSupport.MyLike myLike = MyLikeDynamicSqlSupport.myLike;


    @Override
    public void join(AuditJoinContext<Member> context) {
        context
                .add(JoinDSL
                        .leftJoin(MyLike.class)
                        .select(s -> s
                                .changeValue(member.email).to(myLike.count)
                                .add(myLike.count).alias("member_like_count")
                        )
                        .on(o -> o
                                .set(member.id).isEqualTo(myLike.memberId)));
    }

}
