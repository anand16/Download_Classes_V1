package Package.JavaTutorial;

class School
{
	int rollno;
    String StudentName;
    int marks;




public void studentmarks()
{
System.out.println("The marks of the student are"+ marks);	
}

public void studentrollno()
{
System.out.println("The marks of the student are"+ rollno);	
}

public void studentname()
{
System.out.println("The marks of the student are"+ StudentName);	
}


}

class Convent extends School
{

	void studentdetails()
	{
		
		System.out.println("Student Details are displayed");
	}// TODO Auto-generated constructor stub
	
	
}


public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Convent c1= new Convent();
		c1.marks=90;
		c1.rollno=36;
		c1.StudentName="Student";
		c1.studentrollno();
		c1.studentname();
		c1.studentmarks();
		c1.studentdetails();

	}

}
