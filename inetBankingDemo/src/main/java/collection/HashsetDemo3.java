package collection;

import java.util.HashSet;

public class HashsetDemo3 {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		System.out.println("first hash set" + hs);
		
		HashSet<Integer> hs1=new HashSet<Integer>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(6);
		hs1.add(7);
		hs1.add(8);
		
		System.out.println("second hash set"+ hs1);
		
		hs.addAll(hs1);
		
		System.out.println("union"+hs);
		
		hs.retainAll(hs1);
		
		System.out.println("intersection"+ hs);
		
		hs.removeAll(hs1);
		
		System.out.println(hs);
		
		
	}
}
