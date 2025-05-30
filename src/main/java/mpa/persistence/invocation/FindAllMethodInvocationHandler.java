package mpa.persistence.invocation;

import mpa.annotation.MPAAnnotations;
import mpa.persistence.QueryExecutor;
import mpa.persistence.annotation.Entity;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.core.annotation.AnnotationUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class FindAllMethodInvocationHandler implements MethodInvocationHandler {

    private final QueryExecutor queryExecutor;


    public FindAllMethodInvocationHandler(QueryExecutor queryExecutor) {
        this.queryExecutor = queryExecutor;
    }


    @Override
    public boolean supports(Method method) {
        if (method == null) {
            return false;
        }
        return "findAll".equals(method.getName());
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object entity = objects[0];
        Entity entityAnnotation = AnnotationUtils.findAnnotation(entity.getClass(), MPAAnnotations.ENTITY);
        String tableName = entityAnnotation.name();
        Type genericReturnType = method.getGenericReturnType();

        Class<?> returnType = method.getReturnType();

        genericReturnType.getTypeName();
        return null;
    }
}
