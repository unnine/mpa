package mpa.audit_old.transaction;

import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.UUID;

public class AuditTransactionManager {

    private static final String RESOURCE_NAME = "$$auditTailIdentifier";


    private AuditTransactionManager() {}


    public static void clear() {
        removeCurrentTransactionId();
    }

    public static void synchronizeTransaction(TransactionSynchronization synchronization) {
        initCurrentTransaction();
        bindListener(synchronization);
    }

    static boolean isCurrentTransactionActive() {
        return hasCurrentTransactionResource();
    }

    private static void initCurrentTransaction() {
        if (hasCurrentTransactionResource()) {
            return;
        }
        if (!TransactionSynchronizationManager.isSynchronizationActive()) {
            TransactionSynchronizationManager.initSynchronization();
        }
        setCurrentTransactionResource(createTransactionId());
    }

    private static void removeCurrentTransactionId() {
        if (hasCurrentTransactionResource()) {
            TransactionSynchronizationManager.unbindResource(RESOURCE_NAME);
        }
    }

    private static String createTransactionId() {
        return UUID.randomUUID().toString();
    }

    private static void bindListener(TransactionSynchronization listener) {
        TransactionSynchronizationManager.registerSynchronization(listener);
    }

    private static boolean hasCurrentTransactionResource() {
        return TransactionSynchronizationManager.hasResource(RESOURCE_NAME);
    }

    private static void setCurrentTransactionResource(String transactionId) {
        TransactionSynchronizationManager.bindResource(RESOURCE_NAME, transactionId);
    }
}