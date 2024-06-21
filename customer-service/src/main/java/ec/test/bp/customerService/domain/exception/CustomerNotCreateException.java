package ec.test.bp.customerService.domain.exception;

public class CustomerNotCreateException extends ResourceNotCreateException{


    public CustomerNotCreateException(String error) {
        super("customer", error);
    }
}
