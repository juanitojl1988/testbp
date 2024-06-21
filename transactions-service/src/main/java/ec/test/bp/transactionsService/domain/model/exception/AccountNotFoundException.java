package ec.test.bp.transactionsService.domain.model.exception;

public class AccountNotFoundException extends ResourceNotFoundException{
  public AccountNotFoundException(String keyName, String keyValue) {
        super("Account", keyName, keyValue);
    }
}
