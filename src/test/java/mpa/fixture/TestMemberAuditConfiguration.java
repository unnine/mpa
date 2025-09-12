package mpa.fixture;

import default$.Member;
import default$.MyLike;
import default$.repository.MemberDynamicSqlSupport;
import default$.repository.MyLikeDynamicSqlSupport;
import mpa.audit.config.entity.AuditJoinContext;
import mpa.audit.config.entity.EntityAuditConfigurer;
import mpa.audit.repository.sql.join.JoinDSL;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration
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
