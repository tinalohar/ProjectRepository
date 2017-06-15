package bootsample.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import bootsample.model.Employee;

public interface EmployeeMapper {
	@Select("select * from employee")
	List<Employee> getAllEmployeeDetails();
	
	@Insert("insert into employee(name,location,emailid,mobileno) value(#{employeeName},#{location},#{emailId},#{mobileNo})")
	void insertEmployee(Employee employee);
	
	@Update("Update employee set name=#{employeeName},location=#{location}, emailid=#{emailId},mobileNo=#{mobileNo}")
	void updateEmployee(Employee employee);
	
	@Delete("DELETE FROM employee WHERE employeeid =#{employeeId}")
	void deleteEmployee(int empId);
}
