package mpa.audit.config.strategy;

import java.util.Arrays;
import java.util.function.Function;

public enum StringCaseConverter {
    NONE(StringCaseConverter::none),
    CAMEL_TO_UPPER_SNAKE(StringCaseConverter::camelToUpperSnake),
    CAMEL_TO_LOWER_SNAKE(StringCaseConverter::camelToLowerSnake),
    SNAKE_TO_CAMEL(StringCaseConverter::snakeToCamel),
    ;

    private final Converter converter;


    StringCaseConverter(Converter converter) {
        this.converter = converter;
    }


    public String convert(String s) {
        return converter.apply(s);
    }

    private static String none(String s) {
        return s;
    }

    private static String camelToUpperSnake(String s) {
        return camelToSnake(s).toUpperCase();
    }

    private static String camelToLowerSnake(String s) {
        return camelToSnake(s).toLowerCase();
    }

    private static String camelToSnake(String s) {
        return s
                .replaceAll("([A-Z])", "_$1")
                .replaceAll("([a-z][A-Z])", "$1_$2")
                .replaceAll("([a-z])([0-9][a-z])", "$1_$2");
    }

    private static String snakeToCamel(String s) {
        String[] fragments = toLowerCaseArray(s);
        StringBuilder sb = new StringBuilder(fragments[0]);
        for (int i = 1; i < fragments.length; i++) {
            sb
                    .append(fragments[i].substring(0, 1).toUpperCase())
                    .append(fragments[i].substring(1));
        }
        return sb.toString();
    }

    private static String[] toLowerCaseArray(String s) {
        String[] fragments = s.toLowerCase().split("_");
        return Arrays.copyOfRange(fragments, 0, fragments.length);
    }


    @FunctionalInterface
    public interface Converter extends Function<String, String> {}
}