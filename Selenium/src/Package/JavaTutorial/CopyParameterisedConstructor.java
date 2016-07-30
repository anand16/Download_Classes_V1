package Package.JavaTutorial;

public class CopyParameterisedConstructor {

	int rollno;
	String Name;
	int age;
	
	CopyParameterisedConstructor(int rn, String FN, int ages)
	{
		rollno=rn;
		Name=FN;
		age=ages;
		
	}
	
	CopyParameterisedConstructor( CopyParameterisedConstructor S)
	
	{
	rollno=S.rollno;
	Name=S.Name;
	age=S.age;
		
	}
	
	public void Display()
	
	{
		System.out.println(rollno + ""+Name+""+age );
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyParameterisedConstructor C1= new CopyParameterisedConstructor(20, "Hello", 25);
		CopyParameterisedConstructor C2= new CopyParameterisedConstructor(C1);
		C1.Display();
		C2.Display();
	}

}
