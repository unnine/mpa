package mpa.persistence.generator;

import mpa.util.FileUtil;
import mpa.util.Log;
import mpa.util.XMLReader;
import org.w3c.dom.Document;

import java.util.HashSet;
import java.util.Set;

public class XMLMybatisPersistenceObjectGeneratorRunner implements MybatisPersistenceObjectGenerator {

    private static final Set<MybatisPersistenceGeneratorScope> scopes = new HashSet<>();


    @Override
    public void generate() {
        main(null);
    }

    public static void main(String[] args) {
        Document xml = FileUtil.getXMLFile("mybatis-persistence-assistant.xml");

        if (xml == null) {
            Log.info("not detected configuration 'mybatis-persistence-assistant.xml' file at the classpath.");
            return;
        }

        scopes.addAll(parse(xml));
        JDBCMybatisPersistenceObjectGenerator generator = new JDBCMybatisPersistenceObjectGenerator(scopes);
        generator.generate();
    }

    private static Set<MybatisPersistenceGeneratorScope> parse(Document xml) {
        XMLReader xmlReader = new XMLReader(xml);

        Set<MybatisPersistenceGeneratorScope> scopes = new HashSet<>();

        xmlReader.root(rootNode -> {
            rootNode.childAll("generator", generatorNode -> {
                generatorNode.childAll("scope", scopeNode -> {
                    MybatisPersistenceGeneratorDataSource dataSource = new MybatisPersistenceGeneratorDataSource();
                    MybatisPersistenceGeneratorScope scope = new MybatisPersistenceGeneratorScope();

                    scope.setName(scopeNode.childText("name"));
                    scope.setNamespace(scopeNode.childText("namespace"));

                    scopeNode.child("dataSource", dataSourceNode -> {
                        dataSource.setDriverClassName(dataSourceNode.childText("driverClassName"));
                        dataSource.setConnectionURL(dataSourceNode.childText("connectionURL"));
                        dataSource.setUsername(dataSourceNode.childText("username"));
                        dataSource.setPassword(dataSourceNode.childText("password"));
                        dataSource.setSchema(dataSourceNode.childText("schema"));
                    });

                    scope.setDataSource(dataSource);
                    scopes.add(scope);
                });
            });
        });

        return scopes;
    }
}
