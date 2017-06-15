package bootsample.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import bootsample.model.Employee;
import bootsample.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/get.employee")
	public String getDetails(){
		String employee=employeeService.getAllEmployeeDetails().toString();
		return employee;
	}
	
	@PostMapping("/update.employee")
	public String update(Employee emp){
		employeeService.updateEmployee(emp);
		return "successfully updated";
		
	}
	
	@PutMapping("/insert.employee")
	public String insert(Employee emp){
		employeeService.save(emp);
		return "successfully inserted";
		
	}
	
	@DeleteMapping("/delete.employee")
	public String delete(int empId){
		employeeService.deleteEmployee(empId);;
		return "successfully deleted"+ empId;
		
	}
	
}
