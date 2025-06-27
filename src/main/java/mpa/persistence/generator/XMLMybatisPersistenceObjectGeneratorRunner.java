package mpa.persistence.generator;

import mpa.util.Log;
import mpa.util.XMLReader;
import mpa.util.XMLUtil;
import org.w3c.dom.Document;

import java.util.HashSet;
import java.util.Set;

public class XMLMybatisPersistenceObjectGeneratorRunner {

    private static final Set<MybatisPersistenceGeneratorScope> scopes = new HashSet<>();


    public static void main(String[] args) {
        Document xml = XMLUtil.getFile("mybatis-persistence-assistant.xml");

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
            rootNode.childAll("context", contextNode -> {
                contextNode.childAll("scope", scopeNode -> {
                    MybatisPersistenceGeneratorDataSource dataSource = new MybatisPersistenceGeneratorDataSource();
                    MybatisPersistenceGeneratorScope scope = new MybatisPersistenceGeneratorScope();

                    scopeNode.childText("name").ifPresent(scope::setName);
                    scopeNode.childText("namespace").ifPresent(scope::setNamespace);

                    // TODO 제일 처음만 가져오는 메서드 필요
                    scopeNode.childAll("dataSource", dataSourceNode -> {
                        dataSourceNode.childText("driverClassName").ifPresent(dataSource::setDriverClassName);
                        dataSourceNode.childText("connectionURL").ifPresent(dataSource::setConnectionURL);
                        dataSourceNode.childText("username").ifPresent(dataSource::setUsername);
                        dataSourceNode.childText("password").ifPresent(dataSource::setPassword);
                    });

                    scope.setDataSource(dataSource);
                    scopes.add(scope);
                });
            });
        });

        return scopes;
    }
}
