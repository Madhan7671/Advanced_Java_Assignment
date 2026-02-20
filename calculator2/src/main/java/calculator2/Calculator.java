package calculator2;

public class Calculator {
	private mathService mathservice;
	public Calculator(mathService mathservice) {
		this.mathservice=mathservice;
	}
	public int add(int a,int b)
	{
		return(mathservice.add(a, b));
	}
}
