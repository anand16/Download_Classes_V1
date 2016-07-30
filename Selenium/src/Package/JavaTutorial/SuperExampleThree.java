package Package.JavaTutorial;

class ParentExampleThree
{
ParentExampleThree() {
	
	System.out.println("Parent Class Constructor Invoked");
}

}


 class subclassofParent extends ParentExampleThree
{
	 subclassofParent()
	 {
		 super();
		 System.out.println("Subclass constructor invoked");
		 
	 }

}

public class SuperExampleThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subclassofParent scp= new subclassofParent();
		
	}

}
