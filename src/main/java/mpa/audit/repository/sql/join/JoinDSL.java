package mpa.audit.repository.sql.join;

public class JoinDSL {

    public static Join leftJoin(Class<?> joinEntityClass) {
        return Join.ofLeftJoin(joinEntityClass);
    }

}
