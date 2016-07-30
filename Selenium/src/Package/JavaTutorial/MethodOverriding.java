package Package.JavaTutorial;

class Bank
{
public int rateofinterest()
{
	return 10;
}

}
class AxisBank extends Bank
{

public int rateofinterest()

{
return 15;	
}
}

class SBI extends Bank
{

public int rateofinterest()

{
return 20;	
}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AxisBank c1= new AxisBank();
System.out.println(""+c1.rateofinterest());
SBI c2= new SBI();
System.out.println(""+c2.rateofinterest());
	}

}
