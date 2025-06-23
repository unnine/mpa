package mpa.persistence.aop;

import lombok.RequiredArgsConstructor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;

import java.util.StringJoiner;

@RequiredArgsConstructor
public class DefaultPersistenceRepositoryPointCutFactory implements PersistenceRepositoryPointCutFactory {

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
        return "execution(* insert*(..))";
    }

    private String updateExpression() {
        return "execution(* update*(..))";
    }

    private String deleteExpression() {
        return "execution(* delete*(..))";
    }
}