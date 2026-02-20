/**
 * 
 */
package demo10;

/**
 * 
 */
public class Employee {
	private int empid;
	private String name;
	private String department;
	private String designation;
	private double salary;
	private double yearsOfExperience;
	public Employee(int empid, String name, String department, String designation, double salary,
			double yearsOfExperience) {
		super();
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", department=" + department + ", designation="
				+ designation + ", salary=" + salary + ", yearsOfExperience=" + yearsOfExperience + "]";
	}
	
}
