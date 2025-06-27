package mpa.audit.repository.database.schema;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MetaColumn {

    private final String name;

    private final String comment;
}
