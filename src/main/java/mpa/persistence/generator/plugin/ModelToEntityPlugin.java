package mpa.persistence.generator.plugin;

import mpa.persistence.generator.ModelEnhancer;
import mpa.persistence.generator.ModelEntityEnhancer;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;

public class ModelToEntityPlugin extends PluginAdapter {

    private final ModelEnhancer entityEnhancer = new ModelEntityEnhancer();


    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        entityEnhancer.enhance(topLevelClass, introspectedTable);
        return true;
    }

    @Override
    public boolean modelRecordWithBLOBsClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        entityEnhancer.enhance(topLevelClass, introspectedTable);
        return true;
    }
}
