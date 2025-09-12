package mpa.audit.repository.sql.join;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public class AdditionalColumn {

    private final String columName;

    private final String alias;

}
