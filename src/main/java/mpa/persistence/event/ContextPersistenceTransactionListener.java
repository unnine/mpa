package mpa.persistence.event;

import lombok.RequiredArgsConstructor;
import mpa.persistence.transaction.PersistenceTransactionListener;
import mpa.persistence.transaction.PersistenceTransactionSynchronizationManager;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class ContextPersistenceTransactionListener implements PersistenceTransactionListener {

    private final List<PersistenceTransactionListener> listeners = new ArrayList<>();


    public void addListener(PersistenceTransactionListener listener) {
        this.listeners.add(listener);
    }

    @Override
    public void synchronizeTransaction() {
        PersistenceTransactionSynchronizationManager.synchronizeTransaction(this);
        listeners.forEach(PersistenceTransactionListener::synchronizeTransaction);
    }

    @Override
    public void beforeCommit(boolean readOnly) {
        listeners.forEach(listener -> listener.beforeCommit(readOnly));
    }

    @Override
    public void afterCommit() {
        listeners.forEach(PersistenceTransactionListener::afterCommit);
    }

    @Override
    public void afterCompletion(int status) {
        listeners.forEach(listener -> listener.afterCompletion(status));
        clear();
    }

    private void clear() {
        PersistenceTransactionSynchronizationManager.releaseResources();
    }
}