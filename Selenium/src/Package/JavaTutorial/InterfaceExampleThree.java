package Package.JavaTutorial;

interface First
{   void firstprogram();
}

interface Second
{
	void programtwo();
}

interface Three extends First,Second
{
void programthree();	
}


class MultipleInheritance implements Three

{
	public void firstprogram() {
		// TODO Auto-generated method stub
	System.out.println("Hello FP");	
	}

	
	public void programtwo() {
		// TODO Auto-generated method stub
		System.out.println("Hello SP");
	}

	
	public void programthree() {
		// TODO Auto-generated method stub
		System.out.println("Hello TP");
	}
	
}
public class InterfaceExampleThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultipleInheritance minherit= new MultipleInheritance();
minherit.firstprogram();
minherit.programtwo();
minherit.programthree();
	}

}
