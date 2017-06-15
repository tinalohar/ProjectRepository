package bootsample.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="t_tasks")
public class Task 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator = "my_entity_seq_gen")
	@SequenceGenerator(name="my_entity_seq_gen", sequenceName="t_tasks_id_seq")
	private long id;
	
	private String name;
	
	private String description;
	
	@Temporal(TemporalType.DATE)
	private Date date_created;
	
	private boolean finished;

	public Task(){}
	
	
	public Task(String name, String description, Date date_created, boolean finished) {
		super();
		this.name = name;
		this.description = description;
		this.date_created = date_created;
		this.finished = finished;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public Date getDate_created() {
		return date_created;
	}


	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", description=" + description + ", dateCreated=" + date_created
				+ ", finished=" + finished + "]";
	}
	
	
	
}
