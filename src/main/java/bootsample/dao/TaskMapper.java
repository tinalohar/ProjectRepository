package bootsample.dao;

import java.util.Collection;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import bootsample.model.Task;

//@Mapper
public interface TaskMapper {

	
	@Select("select * from t_tasks")
	Collection<Task> findAll();
	
	//#{} --> Object Graphical Notification Language -- values correspond to the context, which in this case is the task object passed as parameter
	//@Options(useGeneratedKeys = true)
	@Insert("INSERT INTO t_tasks(name, description, date_created, finished) VALUES ( #{name}, #{description}, #{date_created}, #{finished})")
	void save(Task task);
	
	@Delete("delete from t_tasks where id=:id")
	void delete(long id);
}
