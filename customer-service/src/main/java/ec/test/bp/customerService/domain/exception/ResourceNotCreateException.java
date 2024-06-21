package ec.test.bp.customerService.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotCreateException extends RuntimeException{

    ResourceNotCreateException(String resourceType, String error) {
        super(resourceType + " not create, error: "+error);
    }

}
