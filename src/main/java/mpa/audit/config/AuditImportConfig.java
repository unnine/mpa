package mpa.audit.config;

import iit.audit.aop.AuditPointCutFactory;
import iit.audit.aop.DefaultAuditPointCutFactory;
import iit.audit.aop.SpecificAuditPointCutFactory;
import iit.audit.config.annotation.EnableAudit;
import iit.audit.config.scope.AuditScope;
import iit.audit.config.scope.AuditScopeDefinition;
import iit.audit.config.scope.DefaultAuditScopeDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.Objects;

public class AuditImportConfig implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        AuditScopeDefinition scopeDefinition = createDefinition(importingClassMetadata);
        AuditPointCutFactory pointCutFactory = createPointCutFactory(scopeDefinition);

        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(AuditInitializer.class);
        builder.addConstructorArgValue(scopeDefinition);
        builder.addConstructorArgValue(pointCutFactory);

        registry.registerBeanDefinition(AuditInitializer.class.getName(), builder.getBeanDefinition());
    }

    private boolean isScopeConfig(AnnotationAttributes[] attributes) {
        return attributes != null && attributes.length > 0;
    }

    private AuditScopeDefinition createDefinition(AnnotationMetadata importingClassMetadata) {
        Map<String, Object> attributesMap = importingClassMetadata.getAnnotationAttributes(EnableAudit.class.getName());
        Objects.requireNonNull(attributesMap);

        AnnotationAttributes[] attributes = (AnnotationAttributes[]) attributesMap.get("scopes");

        if (isScopeConfig(attributes)) {
            return createScopeDefinition(attributes);
        } else {
            return createDefaultDefinition();
        }
    }

    @SuppressWarnings("unchecked")
    private AuditScopeDefinition createScopeDefinition(AnnotationAttributes[] attributes) {
        AuditScopeDefinition scopeDefinition = DefaultAuditScopeDefinition.scopeConfigDefinition();

        for (AnnotationAttributes attribute : attributes) {
            AuditScope scope = new AuditScope();
            scope.setName(getScopeName(attribute));
            scope.setSchema((String) attribute.get("schema"));
            scope.setDataSourceRef((String) attribute.get("dataSourceRef"));
            scope.addBasePackages((String[]) attribute.get("basePackages"));
            scope.setConfigurerClass((Class<? extends AuditConfigurer>) attribute.get("configClass"));
            scopeDefinition.addScopes(scope);
        }
        return scopeDefinition;
    }

    private AuditScopeDefinition createDefaultDefinition() {
        AuditScopeDefinition scopeDefinition = DefaultAuditScopeDefinition.defaultConfigDefinition();
        scopeDefinition.addScopes(AuditScope.ofDefault());
        return scopeDefinition;
    }

    private String getScopeName(AnnotationAttributes attribute) {
        String name = (String) attribute.get("name");

        if (!StringUtils.hasText(name)) {
            name = (String) attribute.get("dataSourceRef");
        }
        return name;
    }

    private AuditPointCutFactory createPointCutFactory(AuditScopeDefinition scopeDefinition) {
        if (scopeDefinition.isScopeConfig()) {
            return new SpecificAuditPointCutFactory();
        }
        return new DefaultAuditPointCutFactory();
    }
}