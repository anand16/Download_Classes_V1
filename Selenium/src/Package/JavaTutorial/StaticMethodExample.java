package Package.JavaTutorial;

public class StaticMethodExample {
	
	int RollNo;
	int age;
	static String Name="Anand";
	
	StaticMethodExample(int rn,int ages)
	
	{
		RollNo=rn;
	    age=ages;
	}
	
	static void change()
	{
		Name="Testingman";
	}
	
	void dsplay()
	{
	System.out.println(age+"" +RollNo+""+Name);	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodExample.change();
		StaticMethodExample C1= new StaticMethodExample(20, 40);
		C1.dsplay();
	}

}
