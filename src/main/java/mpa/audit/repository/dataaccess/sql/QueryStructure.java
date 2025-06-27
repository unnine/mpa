package mpa.audit.repository.dataaccess.sql;

import lombok.Getter;
import mpa.util.Log;
import mpa.util.StringUtil;

@Getter
public class QueryStructure {

    private String selectClause;
    private String fromClause;
    private String conditionClause = "";
    private String orderByClause = "";


    public void changeSelectClause(String selectClause) {
        this.selectClause = selectClause;
    }

    public void changeFromClause(String fromClause) {
        this.fromClause = fromClause;
    }

    public void changeConditionClause(String conditionClause) {
        this.conditionClause = conditionClause;
    }

    public void changeOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String generateQuery() {
        if (StringUtil.isEmpty(selectClause) || StringUtil.isEmpty(fromClause)) {
            throw new IllegalStateException(Log.format("The query was not cached."));
        }
        return selectClause + fromClause + conditionClause + orderByClause;
    }
}
