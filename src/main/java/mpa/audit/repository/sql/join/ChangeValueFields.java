package mpa.audit.repository.sql.join;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public class ChangeValueFields {

    private final String baseFieldsName;

    private final String joinFieldsName;

}
