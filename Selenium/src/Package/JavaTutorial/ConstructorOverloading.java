package Package.JavaTutorial;

public class ConstructorOverloading {
int RoolNo;
String Name;
int age;

ConstructorOverloading(int rn,String FN)
{
RoolNo=rn;
Name=FN;
}

ConstructorOverloading(int rn,String FN,int Duration)
{
RoolNo=rn;
Name=FN;
age=Duration;
}

public void display()
{
System.out.println(RoolNo+""+Name+ ""+age);	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorOverloading c1= new ConstructorOverloading(20, "Stephen");
ConstructorOverloading c2=new ConstructorOverloading(20, "Peterson", 40);
c1.display();
c2.display();

	}

}
