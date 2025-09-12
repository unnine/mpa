package mpa.fixture.transaction;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.IllegalTransactionStateException;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;

@Component
@RequiredArgsConstructor
public class TransactionTestTemplate {

    private final PlatformTransactionManager platformTransactionManager;
    private final JdbcTemplate jdbcTemplate;


    public void run(Runner runner) {
        try {
            TransactionTemplate transactionTemplate = new TransactionTemplate(platformTransactionManager);
            transactionTemplate.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
            transactionTemplate.execute(status -> {
                runner.when();
                platformTransactionManager.commit(status);
                return null;
            });

        } catch (IllegalTransactionStateException e) {
            if (e.getMessage() != null && e.getMessage().startsWith("Transaction is already completed")) {
                return;
            }
            throw e;

        } catch (Exception e) {
            e.printStackTrace();
            throw e;

        } finally {
            runner.then();
            runner.compensate(jdbcTemplate);
        }
    }


    public interface Runner {

        default void when() {}

        default void then() {}

        default void compensate(JdbcTemplate jdbcTemplate) {}

    }
}
