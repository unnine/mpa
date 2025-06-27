package mpa.persistence.entity.schema;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MetaColumnImpl implements MetaColumn {

    private final String name;

    private final String comment;
}
