package Package.JavaStandardPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashTableTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> hst=new HashSet();
		hst.add("one");
		hst.add("two");
		hst.add("three");
		hst.add("four");
		Iterator<String> itr=hst.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
