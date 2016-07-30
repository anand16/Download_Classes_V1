package Package.JavaTutorial;

interface HumanActions
{
	public void walking();
	//public void running();
	
}


class Human implements HumanActions
{
	public void walking()
	{
		System.out.println("Customer is walking");
	}
}
public class InterfaceExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Human hm=new Human();
hm.walking();
	}

}
