package mpa.audit.repository.sql.join;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import mpa.persistence.config.CaseConversionStrategy;
import mpa.util.StringUtil;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class OnConditionColumn {

    private final boolean column;
    private final String name;


    public static OnConditionColumn ofColumn(String columnName) {
        return new OnConditionColumn(true, columnName);
    }

    public static OnConditionColumn ofField(String fieldName) {
        return new OnConditionColumn(false, fieldName);
    }


    public String getName(CaseConversionStrategy caseConversionStrategy) {
        if (StringUtil.isEmpty(name)) {
            return name;
        }
        if (isColumn()) {
            return name;
        }
        return caseConversionStrategy.convert(name);
    }

    private boolean isColumn() {
        return column;
    }

}
