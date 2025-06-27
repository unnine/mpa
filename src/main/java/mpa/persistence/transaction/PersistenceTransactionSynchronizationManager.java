package mpa.persistence.transaction;

import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

public class PersistenceTransactionSynchronizationManager {

//    private static final String RESOURCE_NAME = "__$mybatis$persistence$identifier";


    private PersistenceTransactionSynchronizationManager() {}


    public static void releaseResources() {
//        removeCurrentTransactionId();
    }

    public static void synchronizeTransaction(TransactionSynchronization synchronization) {
        initCurrentTransaction();
        bindListener(synchronization);
    }

    public static boolean isCurrentTransactionActive() {
        return TransactionSynchronizationManager.isActualTransactionActive();
//        return hasCurrentTransactionResource();
    }

    private static void initCurrentTransaction() {
        if (!isCurrentTransactionActive()) {
            return;
        }
//        if (hasCurrentTransactionResource()) {
//            return;
//        }
        if (!TransactionSynchronizationManager.isSynchronizationActive()) {
            TransactionSynchronizationManager.initSynchronization();
        }
//        setCurrentTransactionResource(createTransactionId());
    }

//    private static void removeCurrentTransactionId() {
//        if (hasCurrentTransactionResource()) {
//            TransactionSynchronizationManager.unbindResource(RESOURCE_NAME);
//        }
//    }

//    private static String createTransactionId() {
//        return UUID.randomUUID().toString();
//    }

    private static void bindListener(TransactionSynchronization listener) {
        TransactionSynchronizationManager.registerSynchronization(listener);
    }

//    private static boolean hasCurrentTransactionResource() {
//        return TransactionSynchronizationManager.hasResource(RESOURCE_NAME);
//    }

//    private static void setCurrentTransactionResource(String transactionId) {
//        TransactionSynchronizationManager.bindResource(RESOURCE_NAME, transactionId);
//    }
}