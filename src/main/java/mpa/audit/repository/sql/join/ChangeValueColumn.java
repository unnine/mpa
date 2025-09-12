package mpa.audit.repository.sql.join;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public class ChangeValueColumn {

    private final String baseColumnName;

    private final String joinColumName;

}
