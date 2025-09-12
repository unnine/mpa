package mpa.persistence.holder;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import mpa.persistence.annotation.Mutations;

import java.lang.reflect.Method;
import java.util.Deque;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedDeque;

public class MutationsAnnotationHolder {

    private static final ThreadLocal<Deque<Node>> holder = new InheritableThreadLocal<>();


    public Optional<Mutations> getLast() {
        if (holder.get() == null) {
            return Optional.empty();
        }

        Deque<Node> deque = holder.get();

        if (deque.isEmpty()) {
            return Optional.empty();
        }

        Node node = deque.getLast();

        return Optional.of(node.mutations);
    }

    public void add(Method method, Mutations mutations) {
        if (holder.get() == null) {
            initializeHolder();
        }
        Node node = new Node(getKey(method), mutations);
        holder.get().add(node);
    }

    public void remove(Method method) {
        if (holder.get() == null) {
            initializeHolder();
        }

        Optional<Node> nodeOptional = holder.get()
                .stream()
                .filter(node -> node.key.equals(getKey(method)))
                .findAny();

        if (!nodeOptional.isPresent()) {
            return;
        }

        holder.get().remove(nodeOptional.get());
    }

    private String getKey(Method method) {
        return method.getDeclaringClass().getName() + "$" + method.getName();
    }

    private void initializeHolder() {
        holder.set(new ConcurrentLinkedDeque<>());
    }


    @EqualsAndHashCode(onlyExplicitlyIncluded = true)
    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    private static class Node {

        @EqualsAndHashCode.Include
        private final String key;
        private final Mutations mutations;

    }

}
