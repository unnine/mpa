package mpa.audit.repository.dataaccess.sql.argument;

import lombok.RequiredArgsConstructor;
import mpa.persistence.event.MutationArgument;
import mpa.persistence.holder.Scopable;

@RequiredArgsConstructor
public class ScopableMutationArgumentsParser implements MutationArgumentsParser {

    private final Scopable<MutationArgumentsParser> proxy;


    private MutationArgumentsParser getInstance() {
        return proxy.getInstance();
    }


    @Override
    public Argument parse(MutationArgument mutationArgument) {
        return getInstance().parse(mutationArgument);
    }
}
