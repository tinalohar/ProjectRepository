package bootsample.Exceptions;

public class TaskNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	public TaskNotFoundException(String mes){
		super(mes);
		this.errorMessage= mes;
	}
	
	public TaskNotFoundException(){
		super();
		
	}
	
}
