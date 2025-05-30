package mpa.entity.cache;

import mpa.entity.EntityDefinition;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

public class InMemoryEntityCache implements EntityCache {

    private final Map<String, EntityDefinition> cache = new HashMap<>();


    @Override
    public boolean existsByTableName(String key) {
        return cache.containsKey(key);
    }

    @Override
    public EntityDefinition getByTableName(String key) {
        if (existsByTableName(key)) {
            return cache.get(key);
        }
        return null;
    }

    @Override
    public void clear() {
        cache.clear();
    }

    @Override
    public void add(EntityDefinition entityDefinition) {
        cache.put(entityDefinition.getTableName(), entityDefinition);
    }

    @Override
    public Iterator<EntityDefinition> iterator() {
        return cache.values().iterator();
    }

    @Override
    public void forEach(Consumer<? super EntityDefinition> action) {
        cache.values().forEach(action);
    }

    @Override
    public Spliterator<EntityDefinition> spliterator() {
        return cache.values().spliterator();
    }
}
