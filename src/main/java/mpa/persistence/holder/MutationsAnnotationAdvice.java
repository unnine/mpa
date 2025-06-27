package mpa.persistence.holder;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mpa.persistence.annotation.Mutations;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.core.annotation.AnnotationUtils;

import java.lang.reflect.Method;

@Slf4j
@RequiredArgsConstructor
public class MutationsAnnotationAdvice implements MethodInterceptor {

    private final MutationsAnnotationHolder mutationsHolder;


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Method method = invocation.getMethod();

        try {
            Mutations mutations = AnnotationUtils.findAnnotation(method, Mutations.class);

            mutationsHolder.add(method, mutations);
            return invocation.proceed();

        } finally {
            mutationsHolder.remove(method);
        }
    }

}
