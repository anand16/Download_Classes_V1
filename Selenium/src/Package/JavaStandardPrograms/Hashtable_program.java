package Package.JavaStandardPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashtable_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> hs= new HashSet();
hs.add("one");
hs.add("two");

Iterator it= hs.iterator();
while(it.hasNext())
	
{
	System.out.println(it.next());
}


	}

}
