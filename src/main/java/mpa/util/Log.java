package mpa.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {

    private static final Logger log = LoggerFactory.getLogger(Log.class);


    public static void info(String message, Object... args) {
        log.info(format(message), args);
    }

    public static void warn(String message, Object... args) {
        log.warn(format(message), args);
    }

    public static void error(String message, Throwable e) {
        log.error(format(message), e);
    }

    public static String format(String message, Object... args) {
        return String.format(format(message), args);
    }

    private static String format(String s) {
        return String.format("[MPA] %s", s);
    }

}
