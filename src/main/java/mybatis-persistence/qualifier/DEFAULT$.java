package qualifier;

import org.springframework.beans.factory.annotation.Qualifier;

import mpa.persistence.context.annotation.ScopeName;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE })
@Qualifier
@ScopeName("default$")
public @interface DEFAULT$ {}