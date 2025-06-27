package mpa.persistence.transaction;

import mpa.persistence.context.Scope;
import org.springframework.transaction.support.TransactionSynchronization;

public interface PersistenceTransactionListener extends TransactionSynchronization {

    default void synchronizeTransaction(Scope scope) {}

    default void beforeCommit(boolean readOnly) {}

    default void afterCommit() {}

    default void beforeCompletion() {}

    default void afterCompletion(int status) {}

}