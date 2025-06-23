package mpa.persistence.generator;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.TopLevelClass;

public interface ModelEnhancer {

    void enhance(TopLevelClass topLevelClass, IntrospectedTable introspectedTable);

}
