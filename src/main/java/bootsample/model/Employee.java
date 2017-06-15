package bootsample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator = "my_entity_seq_gen")
	@SequenceGenerator(name="my_entity_seq_gen", sequenceName="employee_employeeid_seq")
	@Column(name="employeeid")
	private long employeeId;
	@Column(name="name")
	private String employeeName;
	@Column(name="emailid")
	private String emailId;
	@Column(name="mobileno")
	private String MobileNo;
	@Column(name="location")
	private String location;
	
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString(){
		return "Employee [id=" + employeeId + ", name=" + employeeName + ", location=" + location + ", mobileNo=" + MobileNo
				+ ", emailId=" + emailId + "]";
		
	}

}
