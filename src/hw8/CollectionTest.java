package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
	
	public static void main(String[] args) {

	List Collection = new ArrayList();
	
	Collection.add(new Integer(100));
	Collection.add(new Double(3.14));
	Collection.add(new Long(21L));
	Collection.add(new Short("100")); //要""是建構子關係
	Collection.add(new Double(5.1));
	Collection.add("Kitty");
	Collection.add(new Integer(100));
	Collection.add(new Long(21L));
	Collection.add(new Object());	
	Collection.add("Snoopy");
	Collection.add(new BigInteger("1000")); //要""是建構子關係
	
	Iterator obj1 = Collection.iterator();
	while(obj1.hasNext()) {
		System.out.println(obj1.next());
	}
//---------------------------------------------------------	
//	
	for(Object obj2 : Collection) {
		System.out.println(obj2);
	}
//---------------------------------------------------------	
//
	for(int i = 0; i < Collection.size(); i++) {
	Object obj3 = Collection.get(i);
	System.out.println(obj3);
	}
//---------------------------------------------------------
	
	Iterator obj4 = Collection.iterator();
	while (obj4.hasNext()) {
		if (!(obj4.next() instanceof Number)) {
	        obj4.remove();
	    }
	}
	System.out.println(Collection);
	
	}
}