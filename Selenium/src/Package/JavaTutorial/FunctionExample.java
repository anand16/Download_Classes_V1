package Package.JavaTutorial;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=5;
		String status;
		status=EvenOdd(number);
		System.out.println(status);
				
		
	}

	
	public static String EvenOdd(int i)
	{
		if(i%2 == 0)
		{
			return "Even";
		}
		else
		{
			return "Odd";
	}
		}
	
}
