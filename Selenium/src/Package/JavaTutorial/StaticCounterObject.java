package Package.JavaTutorial;

public class StaticCounterObject {
static int counter=0;
	
	public void increment()
	{
		counter++;
		System.out.println(counter);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticCounterObject C1=new StaticCounterObject();
		StaticCounterObject C2=new StaticCounterObject();
		StaticCounterObject C3=new StaticCounterObject();
		C1.increment();
		C2.increment();
		C3.increment();
	}

}
