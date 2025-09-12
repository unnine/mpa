package mpa.audit.repository.sql.join;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public class AdditionalFields {

    private final String fieldsName;

    private final String displayName;

}
