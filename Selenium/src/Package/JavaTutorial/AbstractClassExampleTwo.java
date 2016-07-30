package Package.JavaTutorial;

abstract class Vehicle
{ 
	abstract void getVehicleName();
void getSize()
{
	System.out.println("The size is good");
	
}
	
}

class Car extends Vehicle
{

	
	void getVehicleName() {
		System.out.println("The Car name is Honda");
		
	}
	
}

public class AbstractClassExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ExampleTwo et=new ExampleTwo() ;
		
		Car Honda=new Car();
		Honda.getSize();
		Honda.getVehicleName();
	}

}
