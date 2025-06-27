package mpa.audit.config.strategy;

import java.util.ArrayList;
import java.util.List;

public class AdditionColumnNameConverters implements AdditionColumnNameConverter {

    private final List<AdditionColumnNameConverter> converters = new ArrayList<>();

    AdditionColumnNameConverters() {}

    public boolean isNotEmpty() {
        return !converters.isEmpty();
    }

    public void add(AdditionColumnNameConverter converter) {
        this.converters.add(converter);
    }

    @Override
    public String convert(String columName) {
        String result = columName;

        for (AdditionColumnNameConverter converter : converters) {
            result = converter.convert(result);
        }
        return result;
    }
}
