package Package.JavaTutorial;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int j=0;
		for(int i=0;i<10;i++)
		{
			++j;
			if (i==5)
				continue;
			System.out.println("Continue Loop"+j);
			
		}
	}

}

/*continue is used to repeat the next iteration of the loop. when continue is executed subsequent statement in the loop will be not executed the flow goes to the next interation of the loop.
  */