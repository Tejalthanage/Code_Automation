package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		HashSet hs=new HashSet();  //default capacity 16 and load factor is 0.75
		hs.add("manoj");
		hs.add("tejal");
		hs.add(100);
		hs.add(true);
		hs.add(null);
		hs.add('A');
		System.out.println(hs);
		
		//removing data
		
		hs.remove(true);
		
		System.out.println("after removing " + hs);
		
		//taking data
		
		System.out.println("conatins method");
		boolean value = hs.contains("manoj");
		
		System.out.println(value);
		
		
		System.out.println("hashset empty or not" +hs.isEmpty());
		
		
		//read data from hashset

		System.out.println("for each loop");
		
		for (Object object : hs) {
			System.out.println(object);
			
		}
		
		//iterrator method
		
		System.out.println("iterator method");
		
		Iterator it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
	}
}
