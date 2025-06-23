package mpa.audit_old.aop;

import lombok.RequiredArgsConstructor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;

import java.util.StringJoiner;

@RequiredArgsConstructor
public class SpecificAuditPointCutFactory implements AuditPointCutFactory {

    @Override
    public Pointcut create(String[] packageLocations) {
        String separator = " && ";
        String baseExpression = String.format("%s%s", "execution(public * *(..))", separator);
        StringJoiner expression = new StringJoiner(separator, baseExpression, "");
        for (String packageLocation : packageLocations) {
            expression.add(String.format("execution(* %s..*.*(..))", packageLocation));
        }
        AspectJExpressionPointcut annotationPointcut = new AspectJExpressionPointcut();
        annotationPointcut.setExpression(expression.toString());
        return annotationPointcut;
    }
}