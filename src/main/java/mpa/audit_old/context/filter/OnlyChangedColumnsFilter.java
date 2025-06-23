package mpa.audit_old.context.filter;

import mpa.audit_old.repository.database.schema.Data;

import java.util.ArrayList;
import java.util.List;

public class OnlyChangedColumnsFilter implements ColumnsFilter {

    @Override
    public void filter(Data originData, Data updatedData) {
        List<String> notChangedColumnNames = getNotChangedColumnNames(originData, updatedData);
        removeNotChangedColumns(originData, updatedData, notChangedColumnNames);
    }

    private void removeNotChangedColumns(Data originData, Data updatedData, List<String> notChangedColumnNames) {
        originData.forEach(row -> row.removeColumns(notChangedColumnNames));
        updatedData.forEach(row -> row.removeColumns(notChangedColumnNames));
    }

    private List<String> getNotChangedColumnNames(Data originData, Data updatedData) {
        List<String> notChangedColumnNames = new ArrayList<>();

        updatedData.forEach((row, rowIndex) -> row.forEach(column -> {
            originData
                    .getRow(rowIndex)
                    .getColumn(column.name())
                    .ifPresent(originColumn -> {
                        if (originColumn.equalsData(column)) {
                            notChangedColumnNames.add(column.name());
                        }
                    });
        }));
        return notChangedColumnNames;
    }
}
