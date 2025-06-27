package mpa.audit.context.filter;

import lombok.RequiredArgsConstructor;
import mpa.audit.repository.dataaccess.schema.Data;
import mpa.persistence.context.Scopable;

@RequiredArgsConstructor
public class ScopableColumnsFilter implements ColumnsFilter {

    private final Scopable<ColumnsFilter> proxy;


    private ColumnsFilter getInstance() {
        return proxy.getInstance();
    }


    @Override
    public void filter(Data originData, Data updatedData) {
        getInstance().filter(originData, updatedData);
    }
}
