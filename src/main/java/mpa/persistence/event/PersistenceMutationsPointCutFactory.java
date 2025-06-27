package mpa.persistence.event;

import lombok.RequiredArgsConstructor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;

@RequiredArgsConstructor
public class PersistenceMutationsPointCutFactory implements PersistencePointCutFactory {

    @Override
    public Pointcut create(String[] packageLocations) {
        AspectJExpressionPointcut annotationPointcut = new AspectJExpressionPointcut();
        annotationPointcut.setExpression(pointCutExpression());
        return annotationPointcut;
    }

    private String pointCutExpression() {
        return "(" +
                insertExpression() + " || " +
                updateExpression() + " || " +
                deleteExpression() +
                ") && target(mpa.persistence.MybatisPersistenceAssistantRepository)";
    }

    private String insertExpression() {
        return "execution(* " + MutationType.INSERT.identifier() + "*(..))";
    }

    private String updateExpression() {
        return "execution(* " + MutationType.UPDATE.identifier() + "*(..))";
    }

    private String deleteExpression() {
        return "execution(* " + MutationType.DELETE.identifier() + "*(..))";
    }
}