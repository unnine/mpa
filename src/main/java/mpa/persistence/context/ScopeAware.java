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
        String packageName = entityClass.getPackageName();
        return scopes.values().stream()
                .filter(scope -> packageName.contains(scope.getName()) || packageName.contains(scope.getBasePackage()))
                .findAny()
                .orElseThrow(() -> new InvalidAttributeStateException(Log.format("scope is null.")));
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