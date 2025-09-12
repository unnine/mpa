package mpa.audit.repository.sql;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import mpa.util.StringUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

@Getter
public class QueryStructure {

    private Map<String, SelectColumn> selectColumns = new HashMap<>();
    private String fromClause;
    private String conditionClause = "";
    private String orderByClause = "";


    public void addSelectColumn(String key, String columnName, String alias) {
        this.selectColumns.put(key, new SelectColumn(columnName, alias));
    }

    public void changeFromClause(String fromClause) {
        this.fromClause = fromClause;
    }

    public void addFromClause(String fromClause) {
        this.fromClause += fromClause;
    }

    public void changeConditionClause(String conditionClause) {
        this.conditionClause = conditionClause;
    }

    public void changeOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String generateQuery() {
        if (selectColumns.isEmpty() || StringUtil.isEmpty(fromClause)) {
            throw new IllegalStateException("The query was not cached.");
        }
        String selectClause = generateSelectClause();
        return selectClause + fromClause + conditionClause + orderByClause;
    }

    private String generateSelectClause() {
        StringJoiner clause = new StringJoiner(", ");

        for (SelectColumn selectColumn : selectColumns.values()) {
            clause.add(selectColumn.columnName + " AS " + selectColumn.alias);
        }

        return " SELECT " + clause;
    }


    @RequiredArgsConstructor
    private static class SelectColumn {
        private final String columnName;
        private final String alias;
    }
}
