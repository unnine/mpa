package mpa.audit.repository.sql.join;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.mybatis.dynamic.sql.SqlColumn;

import java.util.HashSet;
import java.util.Set;

@Getter(AccessLevel.PACKAGE)
@RequiredArgsConstructor
public class Select {

    private final Set<ChangeValueColumn> changeValueColumns = new HashSet<>();
    private final Set<AdditionalColumn> additionColumns = new HashSet<>();
    private final Set<ChangeValueFields> changeValueFields = new HashSet<>();
    private final Set<AdditionalFields> additionFields = new HashSet<>();


    public ChangeValueColumnDefinition changeValue(SqlColumn<?> originColumn) {
        return new ChangeValueColumnDefinition(this, originColumn.name());
    }

    public AdditionalColumnAliasDefinition add(SqlColumn<?> joinColumn) {
        return new AdditionalColumnAliasDefinition(this, joinColumn.name());
    }

    public ChangeValueFieldsDefinition changeValue(String originField) {
        return new ChangeValueFieldsDefinition(this, originField);
    }

    public AdditionalFieldsAliasDefinition add(String joinField) {
        return new AdditionalFieldsAliasDefinition(this, joinField);
    }

    private void changeValue(String originColumnName, String targetColumnName) {
        this.changeValueColumns.add(new ChangeValueColumn(originColumnName, targetColumnName));
    }

    private void add(String columnName, String columnAlias) {
        this.additionColumns.add(new AdditionalColumn(columnName, columnAlias));
    }


    @RequiredArgsConstructor
    public static class ChangeValueColumnDefinition {

        private final Select select;
        private final String originColumnName;


        public Select to(SqlColumn<?> to) {
            select.changeValue(originColumnName, to.name());
            return select;
        }
    }


    @RequiredArgsConstructor
    public static class ChangeValueFieldsDefinition {

        private final Select select;
        private final String originFieldsName;


        public Select to(String field) {
            select.changeValue(originFieldsName, field);
            return select;
        }
    }


    @RequiredArgsConstructor
    public static class AdditionalColumnAliasDefinition {

        private final Select select;
        private final String columnName;


        public Select alias(String alias) {
            select.add(columnName, alias);
            return select;
        }
    }

    @RequiredArgsConstructor
    public static class AdditionalFieldsAliasDefinition {

        private final Select select;
        private final String field;


        public Select alias(String alias) {
            select.add(field, alias);
            return select;
        }
    }

}
