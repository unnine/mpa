package mpa.persistence.transaction;

import org.springframework.transaction.support.TransactionSynchronization;

public interface PersistenceTransactionListener extends TransactionSynchronization {

    default void synchronizeTransaction() {}

    default void beforeCommit(boolean readOnly) {}

    default void afterCommit() {}

    default void beforeCompletion() {}

    default void afterCompletion(int status) {}

}