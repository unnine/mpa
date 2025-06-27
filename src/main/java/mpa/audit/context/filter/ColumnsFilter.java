package mpa.audit.context.filter;

import mpa.audit.repository.dataaccess.schema.Data;

public interface ColumnsFilter {

    void filter(Data originData, Data updatedData);

}