package Package.JavaTutorial;



//concat,equalsignorecase,charat,equals,compareto,contains

public class StringFunctions {
	
	public String Concat(String s1,String s2)
	{
		String s3=s1.concat(s2);
		return s3;
	}

	public boolean EqualsIgnoreCase(String s1,String s2)
	{
		boolean status=s1.equalsIgnoreCase(s2);
		return status;
	}
	
	public char Charat(String s1,int i)
	{
		char character=s1.charAt(i);
		return character;
	}
	
	public boolean Equals(String s1,String s2)
	{
		boolean status=s1.equals(s2);
		return status;
	}
	
	public int CompareTo(String s1,String s2)
	{
		int value=s1.compareTo(s2);
		return value;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringFunctions sf=new StringFunctions();
String Concat=sf.Concat("Vivek", "anand");
System.out.println(Concat);
char Character=sf.Charat("Hello", 4);
System.out.println(Character);
boolean icase=sf.EqualsIgnoreCase("Hello", "hello");
System.out.println(icase);
int compareto=sf.CompareTo("Hello", "Helioss");
if(compareto==0)
{
System.out.println("Equai");

}
else if(compareto>0)
{ System.out.println("String1 is bigger");
	}

else if(compareto<0)
{
System.out.println("String1 is lesser");	}
	}

}
