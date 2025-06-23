package mpa.audit_old.repository.database.sql;

import lombok.Builder;

@Builder
public class SQLAuditColumnImpl implements SQLAuditColumn {

    /**
     * 쿼리 직후의 컬럼명 (alias)
     */
    private final String columName;

    /**
     * 조인을 통해 나온 컬럼일 때, 드라이빙 테이블의 컬럼명
     */
    private final String originColumnName;

    /**
     * Audit으로 보여주고자 하는 컬럼명
     */
    private final String displayColumnName;

    private final String displayTableName;

    private final String value;

    private final String comment;

    private final String additionalAuditName;

    private final boolean isAdditional;

    private final boolean isJoinAddition;


    @Override
    public String columnName() {
        return columName;
    }

    @Override
    public String originColumnName() {
        return originColumnName;
    }

    @Override
    public String displayColumnName() {
        return displayColumnName;
    }

    @Override
    public String displayTableName() {
        return displayTableName;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public String comment() {
        return comment;
    }

    @Override
    public String additionalAuditName() {
        return additionalAuditName;
    }

    @Override
    public boolean isAdditional() {
        return isAdditional;
    }

    @Override
    public boolean isJoinAddition() {
        return isJoinAddition;
    }
}
