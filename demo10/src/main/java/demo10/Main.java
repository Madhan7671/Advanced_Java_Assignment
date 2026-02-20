package demo10;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the employees");
		int n=sc.nextInt();
		List<Employee> emp_list=new ArrayList<>(n);
		while(n!=0)
		{
			JavaApplication.addEmployees(emp_list);
			n--;
		}
		emp_list.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
		emp_list.stream().mapToDouble(Employee::getSalary).max().getAsDouble();
		emp_list.stream().filter(e->e.getSalary()>80000).forEach(e->System.out.println(e.getName()));
		System.out.println(emp_list.stream().count());
		emp_list.stream().filter(e->e.getYearsOfExperience()>5).forEach(e->System.out.println(e.getName()));
		sc.close();
	}

}
