package Package.JavaTutorial;

public class JavaMethodsTwo {
	int Roolno;
	String Name="";
	
	public void getRoolNo_Firstname(int rn, String fn)
	{
		Roolno=rn;
		Name=fn;
	}
	public void displaydetails()
	{
		System.out.println(Roolno + "" +Name );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
JavaMethodsTwo c2=new JavaMethodsTwo();
c2.getRoolNo_Firstname(20, "Victory");
c2.displaydetails();



	}

}
