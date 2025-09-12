package mpa.audit.repository.sql.join;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import mpa.persistence.config.CaseConversionStrategy;
import mpa.persistence.entity.schema.MetaTable;
import mpa.util.StringUtil;

import java.util.function.Consumer;

@Getter(AccessLevel.PACKAGE)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Join {

    private final Select select = new Select();
    private final On on = new On();
    private final String joinType;
    private final Class<?> joinEntityClass;
    private final String joinTableAlias;


    static Join ofLeftJoin(Class<?> joinEntityClass) {
        return new Join(" LEFT JOIN ", joinEntityClass, StringUtil.random());
    }


    public Join select(Consumer<Select> selectHandler) {
        if (selectHandler != null) {
            selectHandler.accept(select);
        }
        return this;
    }

    public Join on(Consumer<On> onHandler) {
        if (onHandler != null) {
            onHandler.accept(on);
        }
        return this;
    }

    String generateJoinClause(CaseConversionStrategy caseConversionStrategy, MetaTable baseTable, MetaTable joinTable) {
        String onClause = generateOnClause(caseConversionStrategy, baseTable);
        return joinType + joinTable.getName() + " " + joinTableAlias + " " + onClause;
    }

    private String generateOnClause(CaseConversionStrategy caseConversionStrategy, MetaTable baseTable) {
        StringBuilder clause = new StringBuilder(" ON ");
        String baseColumName;
        String joinColumnName;

        for (OnCondition condition : on.getConditions()) {
            baseColumName = condition.getBaseColumn().getName(caseConversionStrategy);
            joinColumnName = condition.getCompareColumn().getName(caseConversionStrategy);

            clause
                    .append(baseTable.addAlias(baseColumName))
                    .append(" = ")
                    .append(joinTableAlias).append(".").append(joinColumnName);
        }

        return clause.toString();
    }

}
