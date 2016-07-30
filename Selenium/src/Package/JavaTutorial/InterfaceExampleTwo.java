package Package.JavaTutorial;


interface HumanEyes{  
void EyesCount();  
}  
  
interface HumanLegs{  
void LegCount();  
}  
  
class Actions implements HumanEyes,HumanLegs{

	
	public void LegCount() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}

	
	public void EyesCount() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}
	
}
/*class C7 implements Printable,Showable{  
  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  

*/
  public class InterfaceExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Actions c2=new Actions();
c2.EyesCount();
c2.LegCount();
	}

}
