package collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList<String> li=new LinkedList<String>();
		li.add("manoj");
		li.add("A");
		li.add("x");
		li.add("B");
		li.add("c");
		
		System.out.println("original linked list" + li);
		
		LinkedList<String> li1=new LinkedList<String>();
		li1.addAll(li);
		System.out.println("new linked list" +li1);
		
		
		li1.removeAll(li);
		System.out.println("after removing" + li1);
		
		
		Collections.sort(li);
		System.out.println("After sorting ->>"+li);
		
		
		Collections.sort(li,Collections.reverseOrder());
		System.out.println("Reverse order ->>"+ li);
		
		
		
		
		
		
		
		
		
		
	}
}
