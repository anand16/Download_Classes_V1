package Package.JavaTutorial;

abstract class exampleone
{
abstract void getName();	
}

class AbstractImpl extends exampleone
{

void getName()
{
	System.out.println("Name of the class is AbstractClass session");		
}


}

public class AbstractClasExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractImpl ail=new AbstractImpl();
		ail.getName();
	}

}
