package collection;

import java.util.HashMap;
import java.util.Set;

public class HashmaoDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		//HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101,"manoj");
		hm.put(102,"tejal");
		hm.put(103,"rahi");
		System.out.println(hm);
		
		hm.put(103,"x");
		hm.put(104,"rahi");
		
		System.out.println(hm);
		
		System.out.println(hm.get(104));
		
		hm.remove(101);
		System.out.println("after remove"+hm);
		
		System.out.println(hm.containsKey(101));
		System.out.println(hm.containsValue("rahi"));
		
		System.out.println(hm.containsValue("manoj"));
		System.out.println(hm.containsKey(102));
		
		System.out.println(hm.isEmpty());
		
		//System.out.println(hm.keySet()); //all the key return
		
	//	System.out.println(hm.values());  //all values 
		
		for (Object values :hm.keySet() ) {
			System.out.println(values);
		}
		
		System.out.println(hm.entrySet());
		
		
	}
}
