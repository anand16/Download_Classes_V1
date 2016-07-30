package Package.JavaTutorial;

public class JavaMethods {

	int Roolno;
	String Name="";
	
	public void getRoolNo()
	{
		System.out.println("The Rool no is "+ Roolno);
	}
	
	public void getName()
	{
		
		System.out.println("The Name is "+ Name);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
JavaMethods jm=new JavaMethods();
jm.Roolno=20;
jm.Name="Anand";
jm.getRoolNo();
jm.getName();

JavaMethods jm2=new JavaMethods();
jm2.Roolno=30;
jm2.Name="Anand";
jm2.getRoolNo();
jm2.getName();


	}

}
