package mpa.util;

import java.util.UUID;

public class StringUtil {

    public static boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }

    public static boolean isNotEmpty(String s) {
        return !isEmpty(s);
    }

    public static String random() {
        return "a" + UUID.randomUUID().toString().replaceAll("-", "").substring(0, 19);
    }

}
