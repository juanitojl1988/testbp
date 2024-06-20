package ec.test.bp.customerService.domain.exception;

public class CustomerNotFoundException extends ResourceNotFoundException{


    public CustomerNotFoundException( String keyName, String keyValue) {
        super("Customer", keyName, keyValue);
    }
}
