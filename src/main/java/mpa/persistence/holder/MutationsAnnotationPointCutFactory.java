package mpa.persistence.holder;

import lombok.RequiredArgsConstructor;
import mpa.persistence.event.PointCutFactory;
import org.springframework.aop.Pointcut;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;

@RequiredArgsConstructor
public class MutationsAnnotationPointCutFactory implements PointCutFactory {

    @Override
    public Pointcut create() {
        AspectJExpressionPointcut annotationPointcut = new AspectJExpressionPointcut();
        annotationPointcut.setExpression(pointCutExpression());
        return annotationPointcut;
    }

    private String pointCutExpression() {
        return "@annotation(mpa.persistence.annotation.Mutations)";
    }

}