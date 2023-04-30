package collection;

import java.util.LinkedList;

public class LinkedliStDemo3_Specialmethod {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		LinkedList li=new  LinkedList<>();
		li.add("manoj");
		li.add("tejal");
		li.add("rahi");
		li.add("shinde");
		li.add("manoj");
		System.out.println(li);
		
		li.addFirst("rajani");
		System.out.println("Add first of the linkedlist "+ li);
		
		li.addLast("shindes");
		
		System.out.println("Add last of the elements" + li);
		
		
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		
		//remove first element
		li.removeFirst();
		System.out.println("after removing first elemnts"+ li);
		
		li.removeLast();
		System.out.println(li);
		
		
	}
	
}
