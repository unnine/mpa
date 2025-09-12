package mpa.audit.repository.sql.join;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.mybatis.dynamic.sql.SqlColumn;

import java.util.HashSet;
import java.util.Set;

@Getter(AccessLevel.PACKAGE)
@RequiredArgsConstructor
public class On {

    private final Set<OnCondition> conditions = new HashSet<>();


    public ConditionColumnBuilder set(SqlColumn<?> column) {
        return new ConditionColumnBuilder(this, OnConditionColumn.ofColumn(column.name()));
    }

    public ConditionColumnBuilder set(String field) {
        return new ConditionColumnBuilder(this, OnConditionColumn.ofField(field));
    }

    private void addCondition(OnConditionColumn baseColumn, OnConditionColumn compareColumn) {
        this.conditions.add(new OnCondition(baseColumn, compareColumn));
    }


    @RequiredArgsConstructor
    public static class ConditionColumnBuilder {

        private final On on;
        private final OnConditionColumn baseColum;


        public On isEqualTo(SqlColumn<?> column) {
            return isEqualsColumn(OnConditionColumn.ofColumn(column.name()));
        }

        public On isEqualTo(String fieldName) {
            return isEqualsColumn(OnConditionColumn.ofField(fieldName));
        }

        private On isEqualsColumn(OnConditionColumn compareColumn) {
            on.addCondition(baseColum, compareColumn);
            return on;
        }
    }

}
