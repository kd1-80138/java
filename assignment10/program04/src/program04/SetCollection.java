package program04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {

		// Collection<String> c=new ArrayList();
		// null is allowed,duplicate null is allowed,mutltiple null allowed

		// Collection<String> c=new HashSet<String>();
		// null is allowed,duplicates are not allowed,multiple null are not allowed
		
		//Collection<String> c=new LinkedHashSet();
		// null is allowed,duplicates are not allowed,multiple null are not allowed

		Collection<String> c = new TreeSet<>();
		//null not allowed,NullPointerException
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());

	}

}
