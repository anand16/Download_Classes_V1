package Package.JavaTutorial;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> hs=new HashSet<>();
hs.add("one");
hs.add("two");
hs.add("three");
hs.add("four");
hs.add("five");
hs.add("two");
Iterator<String> itr=hs.iterator();
while(itr.hasNext())
	
{
System.out.println(itr.next());	
}


	}

}
