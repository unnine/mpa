package mpa.util;

import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Field;

public class ClassUtil {

    public static Field[] getDeclaredFields(Class<?> o) {
        if (Enhancer.isEnhanced(o)) {
            return o.getSuperclass().getDeclaredFields();
        }
        return o.getDeclaredFields();
    }

}
