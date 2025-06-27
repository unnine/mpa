package mpa.audit.repository.dataaccess.sql.argument;

import mpa.persistence.event.MutationArgument;

public interface MutationArgumentsParser {

    Argument parse(MutationArgument mutationArgument);

}
