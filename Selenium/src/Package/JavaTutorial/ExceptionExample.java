package Package.JavaTutorial;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		int i=10;
		int j=0;
		int exception=i/j;
		System.out.println("Following statement not executed");
		}
		
		catch(ArithmeticException E)
		{
			
		System.out.println("Statement Excecuted");	
		}
	}

}
