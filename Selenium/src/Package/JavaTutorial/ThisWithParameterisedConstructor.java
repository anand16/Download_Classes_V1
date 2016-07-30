package Package.JavaTutorial;

public class ThisWithParameterisedConstructor {
	
	int age;
	String Name;
	String city;
	ThisWithParameterisedConstructor(int age,String Name)
	
	{		
		this.age=age;
		this.Name=Name;
	}

ThisWithParameterisedConstructor(int age,String Name,String city)
	
	{		
		this(age,Name);
		this.city=city;
		//this(age,Name);
		
	}

void display()
{
System.out.println(""+age+ ""+Name+ ""+city);
}
	public static void main(String[] args) {
		
		ThisWithParameterisedConstructor T1 = new ThisWithParameterisedConstructor(20, "Anand", "Hyd");
		T1.display();
		// TODO Auto-generated method stub

	}

}
