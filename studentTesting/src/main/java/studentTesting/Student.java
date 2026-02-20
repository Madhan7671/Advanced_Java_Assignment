package studentTesting;

public class Student {
	int mark1;
	int mark2;
	int mark3;
	int studentId;
	String name;
	
	public Student(String name,int studentId,int mark1,int mark2,int mark3) {
		this.name=name;
		this.studentId=studentId;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	public int getMark1() {
		return mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public int getMark3() {
		return mark3;
	}
	public int getStudentId() {
		return studentId;
	}
	public String getName() {
		return name;
	}
	
}
