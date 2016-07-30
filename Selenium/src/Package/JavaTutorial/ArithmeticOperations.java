package Package.JavaTutorial;

public class ArithmeticOperations {
	int sum,multiply,division;

	public int add(int a,int b)
	{
		sum=a+b;
		return sum;
		
	}
	public int multiply(int a, int b)
	{
		multiply=a*b;
		return multiply;
		
	}
	
	public int divide(int a, int b)
	{
		division=a/b;
		return division;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArithmeticOperations ao=new ArithmeticOperations();
int add=ao.add(20, 30);
System.out.println(add);
int mul=ao.multiply(40, 50);
System.out.println(mul);
int div=ao.divide(10, 2);
System.out.println(div);

	}

}
