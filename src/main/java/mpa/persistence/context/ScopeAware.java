package mpa.persistence.context;

import lombok.RequiredArgsConstructor;
import mpa.audit.config.AuditAttribute;
import mpa.persistence.exception.InvalidAttributeStateException;
import mpa.util.Log;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

@RequiredArgsConstructor
public class ScopeAware implements Iterable<Scope> {

    private final Map<String, Scope> scopes = new HashMap<>();

    private final ApplicationContextAware contextAware;


    public void add(Scope scope) {
        Objects.requireNonNull(scope.getName());
        this.scopes.put(scope.getName(), scope);
    }

    public Scope get(String name) {
        if (scopes.containsKey(name)) {
            return scopes.get(name);
        }
        throw new InvalidAttributeStateException(Log.format("not found scope by name. '" + name + "'"));
    }

    public Scope getByEntity(Class<?> entityClass) {
        return getByClassPackageName(entityClass.getPackageName());
    }

    public Scope getByRepository(Class<?> repositoryClass) {
        return getByClassPackageName(repositoryClass.getPackageName());
    }

    private Scope getByClassPackageName(String packageName) {
        Predicate<Scope> containsPackageName = contains(packageName);
        return scopes.values().stream()
                .filter(containsPackageName)
                .findAny()
                .orElseThrow(() -> new InvalidAttributeStateException(Log.format("package name '" + packageName + "' not contains in any scope")));
    }

    private Predicate<Scope> contains(String packageName) {
        return scope -> packageName.contains(scope.getName()) || packageName.contains(scope.getBasePackage());
    }

    public Scope createDefaultScope() {
        DataSource dataSource = contextAware.getBean(DataSource.class);
        Objects.requireNonNull(dataSource);

        Scope scope = Scope.ofDefault();
        scope.setDataSourceAware(DataSourceAware.ofDefault(dataSource));
        scope.setAuditAttribute(new AuditAttribute());
        return scope;
    }

    public boolean exists(String name) {
        return scopes.containsKey(name);
    }

    public boolean isEmpty() {
        return scopes.isEmpty();
    }

    @Override
    public Iterator<Scope> iterator() {
        return scopes.values().iterator();
    }
}