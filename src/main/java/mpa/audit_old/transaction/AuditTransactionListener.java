package mpa.audit_old.transaction;

import org.springframework.transaction.support.TransactionSynchronization;

public interface AuditTransactionListener extends TransactionSynchronization {

    void beforeCommit(boolean readOnly);

    void afterCommit();

    void afterCompletion(int status);
}