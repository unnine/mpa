package mpa.audit.config.annotation;

import mpa.audit.config.AuditImportConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Configuration 클래스를 import합니다.
 * 
 * scope 필드를 통해 명시적으로 1개 이상의 데이터 소스를 적용할 수 있습니다.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(AuditImportConfig.class)
public @interface EnableAudit {

    /**
     * @apiNote 일반적인 경우에는 Audit을 프로젝트 전체에 적용하게 되지만 일정 범위 별로 적용되어야 하는 경우도 있습니다. <br/><br/>
     *
     *          예를 들어, DataSource를 여러 개 적용하는 경우, 패키지 별로 적용 범위를 구분하게 됩니다.
     *          이 때, Audit 모듈도 내부적으로 쿼리하기 위해 DataSource 및 적용 범위를 지정해야 합니다.              <br/><br/>
     *          AuditScopeDefinition은 AuditScope의 배열을 갖고 있으며
     *          AuditScope 별로 Audit 모듈의 인스턴스가 각각 생성됩니다.
     */
    Scope[] scopes() default {};

}