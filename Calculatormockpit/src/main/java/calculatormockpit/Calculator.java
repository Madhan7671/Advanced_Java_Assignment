package calculatormockpit;


public class Calculator {
	private MathService mathservice;
	public Calculator(MathService mathservice) {
		this.mathservice=mathservice;
	}
	public int add(int a,int b)
	{
		return(mathservice.add(a, b));
	}
}

