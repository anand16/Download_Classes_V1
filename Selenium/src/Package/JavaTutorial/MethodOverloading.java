package Package.JavaTutorial;

class OverlaodingConcept
{
	int x,y,z;
	
	public void sum(int x,int y,int z)
	{
		
		System.out.println(x+y+z);
	}
	public void sum(int x,int y)
	{
		System.out.println(x+y);
	}
	public void sum(int x)
	{
		System.out.println(x);
		
		
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OverlaodingConcept oc=new OverlaodingConcept();
System.out.println("Hello");
oc.sum(10, 20, 30);
oc.sum(10, 20);
oc.sum(100);
	}

}
