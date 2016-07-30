package Package.JavaTutorial;

public class Parameterisedonstructor {
	
	int roolno;
	String name;
	
	Parameterisedonstructor(int rn,String FN)
	{
		roolno=rn;
		name=FN;
	}
	public void display()
	{
		
		System.out.println(roolno+ ""+ name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parameterisedonstructor p1=new Parameterisedonstructor(20, "Anand");
p1.display();
	}

}
