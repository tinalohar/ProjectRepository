package bootsample.Controller;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bootsample.Exceptions.TaskNotFoundException;
import bootsample.model.ErrorResponse;
import bootsample.model.Greeting;
import bootsample.model.Task;
import bootsample.service.TaskService;

@RestController
public class GreetingController 
{

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    
    @Autowired
	private TaskService taskService;
    
    
    
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) 
    {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @GetMapping("/all.tasks")
    public String allTasks() throws TaskNotFoundException{
    	
    	String task = taskService.findall().toString();
    	if(task==null)
    		throw new TaskNotFoundException("TaskNot Found");
    	
    	return task;
    		
    	
    }
    
    @ExceptionHandler(TaskNotFoundException.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex){
    	
    	ErrorResponse error = new ErrorResponse();
    	error.setErrorCode(HttpStatus.NOT_FOUND);
    	error.setMessage(ex.getMessage());
    	return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
    	
    }
    
    
    @PostMapping("/save.task")
    public String saveTask(@RequestBody Task task){
    	
    	task.setDate_created(new Date());
    	
    	taskService.save(task);
    	
    	return "task saved";
    	
    }
}
