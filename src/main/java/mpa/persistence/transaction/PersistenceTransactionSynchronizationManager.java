package mpa.persistence.transaction;

import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

public class PersistenceTransactionSynchronizationManager {

    private PersistenceTransactionSynchronizationManager() {}


    public static void releaseResources() {
    }

    public static void synchronizeTransaction(TransactionSynchronization synchronization) {
        if (!isCurrentTransactionActive()) {
            return;
        }
        if (!TransactionSynchronizationManager.isSynchronizationActive()) {
            TransactionSynchronizationManager.initSynchronization();
        }
        // TODO
//        if (isCurrentTransactionActive()) {
            bindListener(synchronization);
//        }
    }

    public static boolean isCurrentTransactionActive() {
        return TransactionSynchronizationManager.isActualTransactionActive();
    }

    private static void bindListener(TransactionSynchronization listener) {
        TransactionSynchronizationManager.registerSynchronization(listener);
    }

}