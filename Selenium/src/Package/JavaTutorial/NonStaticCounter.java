package Package.JavaTutorial;

public class NonStaticCounter {

	int counter=0;
	
	public void increment()
	{
		counter++;
		System.out.println(counter);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
NonStaticCounter c1= new NonStaticCounter();
NonStaticCounter c2= new NonStaticCounter();
NonStaticCounter c3= new NonStaticCounter();
c1.increment();
c2.increment();
c3.increment();
	}

}
