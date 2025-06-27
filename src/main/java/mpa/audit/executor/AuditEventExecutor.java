package mpa.audit.executor;

/**
 * 수동으로 Audit을 수행합니다.
 */
public interface AuditEventExecutor {

    /**
     * @param arguments 변경할 데이터입니다. <br/>
     *                   AuditId에 해당하는 데이터는 반드시 존재해야 합니다. <br/>
     *                   없다면 예외가 발생합니다.
     */
    void put(Object... arguments);

    /**
     * AuditTrailListener의 @BeforeCommit 어노테이션이 선언된 메서드를 실행합니다. <br/>
     * 예외 발생 시 롤백되어야 하는 작업이기 때문에 트랜잭션 내에서만 수행되어야 합니다. <br/>
     * 따라서 afterCommit은 트리거하지 않습니다. <br/><br/>
     *
     * 실행 이후 put으로 넣었던 데이터들은 사라지므로 다시 이벤트를 발행하려면 <br/>
     * 새로운 데이터를 넣어야 합니다.
     */
    void flush();

}