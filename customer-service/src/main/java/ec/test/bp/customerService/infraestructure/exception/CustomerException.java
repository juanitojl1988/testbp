package ec.test.bp.customerService.infraestructure.exception;

import org.springframework.http.HttpStatus;

public class CustomerException extends RuntimeException{

    private HttpStatus errorCode;
    private String errorMessage;

    public CustomerException(HttpStatus errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public CustomerException() {
    }

    public HttpStatus getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(HttpStatus errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }


}
