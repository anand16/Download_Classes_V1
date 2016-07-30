package Package.JavaTutorial;

public class ThiswithDefaultNoArguementConstructor {
	int age;
	String Name;
	
	ThiswithDefaultNoArguementConstructor()
	{
		System.out.println("No Arguement Constructor invoked");
	}
	
	ThiswithDefaultNoArguementConstructor(int age,String Name)
	
	{
		this();
		this.age=age;
		this.Name=Name;
		
	}
	
	void display()
	
	{
		
		System.out.println(""+age + "" + Name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThiswithDefaultNoArguementConstructor T1= new ThiswithDefaultNoArguementConstructor(20, "Anand");
		T1.display();
	}

}
