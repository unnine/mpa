package mpa.audit.config.strategy;

import lombok.extern.slf4j.Slf4j;
import mpa.util.StringUtil;

@Slf4j
public class JoinStrategy {

    private Column columnStrategy = Column.REPLACE_VALUE;
    private String additionColumnNamePrefix = null;
    private String additionColumnNameSuffix = null;
    private final AdditionColumnNameConverters additionColumnNameConverter = new AdditionColumnNameConverters();


    public void setColumnStrategy(Column columnStrategy) {
        if (columnStrategy != null) {
            this.columnStrategy = columnStrategy;
        }
    }

    public void setAdditionColumnNamePrefix(String prefix) {
        if (StringUtil.isNotEmpty(prefix)) {
            this.additionColumnNamePrefix = prefix;
        }
    }

    public void setAdditionColumnNameSuffix(String suffix) {
        if (StringUtil.isNotEmpty(suffix)) {
            this.additionColumnNameSuffix = suffix;
        }
    }

    public void addAdditionColumnNameConverter(AdditionColumnNameConverter converter) {
        if (converter != null) {
            this.additionColumnNameConverter.add(converter);
        }
    }

    public void validate() {
        if (columnStrategy == Column.ADDITION) {
            if (additionColumnNameConverter.isNotEmpty()) {
                log.info("if a addition column name converter is defined, prefix and suffix not applied.");
            }
            else if (StringUtil.isEmpty(additionColumnNamePrefix) && StringUtil.isEmpty(additionColumnNameSuffix)) {
                throw new IllegalStateException("if the join strategy is 'ADDITION', must be set an addition column name converter or prefix or suffix. check the audit configurer.");
            }
        }
    }

    public String convertAdditionColumnName(String columnName) {
        if (!isColumnAddition()) {
            return columnName;
        }
        if (additionColumnNameConverter.isNotEmpty()) {
            return additionColumnNameConverter.convert(columnName);
        }

        StringBuilder sb = new StringBuilder();
        if (additionColumnNamePrefix != null) {
            sb.append(additionColumnNamePrefix);
        }
        sb.append(columnName);
        if (additionColumnNameSuffix != null) {
            sb.append(additionColumnNameSuffix);
        }
        return sb.toString();
    }

    public boolean isColumnAddition() {
        return columnStrategy == Column.ADDITION;
    }


    public enum Column {
        REPLACE_VALUE,
        ADDITION,
    }
}