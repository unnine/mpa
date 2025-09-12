package mpa.audit.repository.sql.join;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class OnCondition {

    private final OnConditionColumn baseColumn;

    private final OnConditionColumn compareColumn;

}
