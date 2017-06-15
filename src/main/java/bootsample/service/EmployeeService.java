package bootsample.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import bootsample.dao.EmployeeMapper;
import bootsample.dao.TaskMapper;
import bootsample.model.Employee;
import bootsample.model.Task;

@Service
@Transactional
public class EmployeeService {
	
private final EmployeeMapper employeeMapper;
	

	public EmployeeService(EmployeeMapper employeeMapper) {
		
		this.employeeMapper = employeeMapper;
	
	}
	
	
	public List<Employee> getAllEmployeeDetails(){
		
		List<Employee> emps = new ArrayList<>();
		
		for( Employee employee:employeeMapper.getAllEmployeeDetails())
			emps.add(employee);
		
			return emps;
		
	}
	
	public void save(Employee employee){
		employeeMapper.insertEmployee( employee);
	}
	
	public void updateEmployee(Employee employee){
		
		employeeMapper.updateEmployee(employee);
	}

	
	public void deleteEmployee(int empId){
		
		employeeMapper.deleteEmployee(empId);
	}
	
	
}
