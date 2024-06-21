package ec.test.bp.transactionsService.domain.model.exception;

public class AccountNotCreateException extends ResourceNotCreateException{

  public  AccountNotCreateException( String error) {
        super("customer", error);
    }
}
