package Package.JavaTutorial;


class Firstclass 
{
private int rollno;
private int marks;
private String StudentName;

public void setRollNo( int rn)
{
	rollno=rn;
}
public void getrollno()
{
	System.out.println(rollno);
}
}


public class DataHidingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Firstclass fnew=new Firstclass();
fnew.setRollNo(28);
fnew.getrollno();
	}

}
