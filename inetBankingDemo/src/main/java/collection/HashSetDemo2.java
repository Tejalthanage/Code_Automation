package collection;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(12);
		hs.add(200);
		hs.add(2);
		System.out.println("even number "+ hs);
		
		HashSet<Integer> number=new HashSet<Integer>();
		number.addAll(hs);
		number.add(100);
		System.out.println("new hashset "+ number);
		
		
		//remove all
		number.removeAll(hs);
		
		System.out.println("after removing "+ number);
		
		
	}
}
