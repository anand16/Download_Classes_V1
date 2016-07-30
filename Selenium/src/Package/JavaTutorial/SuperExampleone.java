package Package.JavaTutorial;
class Base
{
public int speed=20; 
	
}

class inherit extends Base
{
	public void getspeed()
	{
		System.out.println(super.speed);
		
	}
}

public class SuperExampleone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
inherit h1=new inherit();
h1.getspeed();
	}

}
