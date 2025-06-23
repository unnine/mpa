package mpa.audit_old.repository.database.sql.parameter;

import mpa.audit_old.config.ScopedAuditConfiguration;
import mpa.entity.EntityDefinition;
import mpa.util.Log;
import mpa.util.TypeValidator;

public class QueryArgumentsParserProvider implements QueryArgumentsParser {

    private final QuerySinglePrimitiveTypeArgumentsParser singlePrimitiveTypeParameterParser;
    private final QuerySingleReferenceTypeArgumentsParser singleReferenceTypeParameterParser;


    public QueryArgumentsParserProvider(ScopedAuditConfiguration configuration) {
        this.singlePrimitiveTypeParameterParser = new QuerySinglePrimitiveTypeArgumentsParser(configuration);
        this.singleReferenceTypeParameterParser = new QuerySingleReferenceTypeArgumentsParser(configuration);
    }


    @Override
    public Parameter parse(EntityDefinition entityDefinition, Object[] queryArguments) {
        int len = queryArguments.length;

        QueryArgumentsParser parser = null;

        if (len == 1 && TypeValidator.isPrimitive(queryArguments[0])) {
            parser = singlePrimitiveTypeParameterParser;
        }
        else if (len == 1 && !TypeValidator.isPrimitive(queryArguments[0])) {
            parser = singleReferenceTypeParameterParser;
        }

        if (parser == null) {
            throw new IllegalArgumentException(Log.format("no parser matching the parameters was found."));
        }

        return parser.parse(entityDefinition, queryArguments);
    }
}
