package Package.JavaTutorial;

public class WhyToUseThis {
	
	int rollno;
	String name="";
	int age;
	
	WhyToUseThis(int rollno,String name,int age)
	
	{
		rollno=rollno;
		name=name;
		age=age;
	}
	
	void display()
	
	{
		
		System.out.println("" + rollno + "" + name+ "" + age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhyToUseThis C1= new WhyToUseThis(20, "abc", 40);
		C1.display();
	}

}
