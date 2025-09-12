package mpa.fixture.domain;

import mpa.fixture.domain.test_db.MyLike;
import org.springframework.jdbc.core.JdbcTemplate;

public class MyLikeUtil {

    public static MyLike newLike(int memberId, int likeCount) {
        MyLike like = new MyLike();
        like.setId(1);
        like.setMemberId(memberId);
        like.setCount(likeCount);
        return like;
    }

    public static void deleteLike(JdbcTemplate jdbcTemplate) {
        jdbcTemplate.execute("DELETE FROM MY_LIKE WHERE id = 1");
    }

}
