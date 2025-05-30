package mpa.persistence.invocation;

import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

public interface MethodInvocationHandler extends InvocationHandler {

    boolean supports(Method method);

}
