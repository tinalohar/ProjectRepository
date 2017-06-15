package bootsample.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import bootsample.Exceptions.TaskNotFoundException;
import bootsample.model.ErrorResponse;


@ControllerAdvice
public class ExceptionControllerAdvice {
	
	
	@ExceptionHandler(value={TaskNotFoundException.class, NullPointerException.class})
	public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex){
    	
    	ErrorResponse error = new ErrorResponse();
    	error.setErrorCode(HttpStatus.NOT_FOUND);
    	error.setMessage(ex.getMessage());
    	return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
    	
    }

}
