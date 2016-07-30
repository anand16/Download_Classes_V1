package Package.JavaTutorial;

public class ThisKeyword {

	int rollno;
	String name;
	int age;
	
	ThisKeyword(int rollno,String name,int age)
	
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	
	void display()
	
	{
		
		System.out.println("" + rollno + "" + name+ "" + age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword T1 = new ThisKeyword(20, "Anand", 45);
		T1.display();

	}

}
