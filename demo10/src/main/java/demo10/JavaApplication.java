/**
 * 
 */
package demo10;
import java.util.*;
/**
 * 
 */
public interface JavaApplication {
	Scanner sc=new Scanner(System.in);
	public static void addEmployees(List<Employee> list) {
		System.out.println("Enter the empid");
		int empid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name of the employee");
		String name=sc.nextLine();
		System.out.println("Enter the department of the employee");
		String department=sc.nextLine();
		System.out.println("Enter the designation of the employee");
		String designation=sc.nextLine();
		System.out.println("Enter the sal of the employee");
		double sal=sc.nextDouble();
		System.out.println("Enter the yearofexperience of the employee");
		double yearsofexperience=sc.nextDouble();
		list.add(new Employee(empid,name,department,designation,sal,yearsofexperience));
	}
}

