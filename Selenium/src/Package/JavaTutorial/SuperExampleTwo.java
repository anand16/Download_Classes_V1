package Package.JavaTutorial;


class ExampleTwo
{ 
	int speed=30;

public void setSpeed()
{
System.out.println(speed);
}

	
}

class Inh extends ExampleTwo
{
 int speed=50;
 
 public void inh_speed()
 {
	 System.out.println(speed);
	 super.setSpeed();
 }


}
public class SuperExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Inh h1= new Inh();
h1.inh_speed();
	}

}
