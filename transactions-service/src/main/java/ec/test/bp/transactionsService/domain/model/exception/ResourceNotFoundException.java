package ec.test.bp.transactionsService.domain.model.exception;

import ec.test.bp.transactionsService.domain.model.constant.ResourceErrorEnum;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class ResourceNotFoundException extends RuntimeException{

   private final String errorCode;

    ResourceNotFoundException(ResourceErrorEnum resourceErrorEnum, Object... args) {
        super(String.format(resourceErrorEnum.getMessage(),args));
        this.errorCode=resourceErrorEnum.getCode();
    }

    public String getErrorCode() {
        return errorCode;
    }
}
