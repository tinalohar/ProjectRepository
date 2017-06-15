package bootsample.service;



import java.util.ArrayList;
import java.util.List;


import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import bootsample.dao.TaskMapper;
import bootsample.dao.TaskRepository;
//import bootsample.dao.TaskRepository;
import bootsample.model.Task;

@Service
@Transactional
public class TaskService 
{

	//private final TaskRepository taskRepository;
	
	private final TaskMapper taskMapper;
	

	public TaskService(TaskMapper taskMapper) {
		
		this.taskMapper = taskMapper;
	
	}
	
	
	public List<Task> findall(){
		
		List<Task> tasks = new ArrayList<>();
		
		/*for( Task task:taskMapper.findAll()){
			tasks.add(task);
		}*/
		return tasks;
		
	}
	
	public void save(Task task){
		
		taskMapper.save(task);
	}
	
	public void delete(long id){
		
		taskMapper.delete(id);
	}
	
	
	
	
}
