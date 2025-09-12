package mpa.util;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.core.annotation.AnnotationUtils;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

public class ClassUtil {

    public static Class<?> toClass(String className) {
        try {
            return Class.forName(className);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Class<?> getOriginalClass(Class<?> o) {
        if (Enhancer.isEnhanced(o)) {
            return o.getSuperclass();
        }
        return o;
    }

    public static <T extends Annotation> T getAnnotation(Class<?> clazz, Class<T> annotationClass) {
        Class<?> originalClass = getOriginalClass(clazz);
        return AnnotationUtils.findAnnotation(originalClass, annotationClass);
    }

    public static <T extends Annotation> boolean isAnnotationPresent(Class<?> clazz, Class<T> annotationClass) {
        return getAnnotation(clazz, annotationClass) != null;
    }

    public static Field[] getDeclaredFields(Class<?> o) {
        return getOriginalClass(o).getDeclaredFields();
    }

    public static Class<?> getImplementsGenericTypeByTypeName(Class<?> clazz, String typeName) {
        Type[] types = Arrays.stream(getOriginalClass(clazz).getGenericInterfaces())
                .filter(type -> type.getTypeName().startsWith(typeName))
                .map(type -> (ParameterizedType) type)
                .map(ParameterizedType::getActualTypeArguments)
                .findAny()
                .orElseThrow(() -> new RuntimeException("Not found implements generic type '" + typeName + "' of '" + clazz.getName() + "'"));
        return (Class<?>) types[0];
    }

    public static List<Class<?>> findClassesWithAnnotation(String packageName, Class<? extends Annotation> annotationClass) {
        List<Class<?>> annotatedClasses = new ArrayList<>();

        List<Class<?>> classes = getClassesInPackage(packageName);
        classes.forEach(clazz -> {
            if (ClassUtil.isAnnotationPresent(clazz, annotationClass)) {
                annotatedClasses.add(clazz);
            }
        });

        return annotatedClasses;
    }

    private static List<Class<?>> getClassesInPackage(String packageName) {
        Enumeration<URL> resources = getResources(packageName);

        List<File> dirs = new ArrayList<>();

        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }

        List<Class<?>> classes = new ArrayList<>();
        dirs.forEach(file -> classes.addAll(findClasses(file, packageName)));

        return classes;
    }

    private static Enumeration<URL> getResources(String packageName) {
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            String path = packageName.replace('.', '/');
            return classLoader.getResources(path);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Class<?>> findClasses(File directory, String packageName) {
        List<Class<?>> classes = new ArrayList<>();

        if (!directory.exists()) {
            return classes;
        }

        File[] files = directory.listFiles();

        if (files == null) {
            return classes;
        }

        String classExtension = ".class";

        for (File file : files) {
            if (file.isDirectory()) {
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
                continue;
            }

            if (file.getName().endsWith(classExtension)) {
                String className = packageName + '.' + file.getName().substring(0, file.getName().length() - classExtension.length());
                classes.add(toClass(className));
            }
        }

        return classes;
    }

}
