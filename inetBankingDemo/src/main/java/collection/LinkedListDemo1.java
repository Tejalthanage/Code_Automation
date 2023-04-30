package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		LinkedList<Object> li=new LinkedList<>();
		
		//add elements into the linked list
		li.add("manoj");
		li.add(10);
		li.add(101.23);
		li.add(true);
		li.add(null);
		System.out.println(li);
		
		//size of elements
		System.out.println(li.size());  //5
		
		//remove elemnts from list
		li.remove(3);
		System.out.println("after removing"+ li);
		
		//remove element by passing value
		
		li.remove(101.23);
		System.out.println(li);
		
		
		li.add(2,"tejal");
		System.out.println("adding a perticular position ->>" + li);
		
		li.set(3, "rahi");
		System.out.println("replace elements null to rahi ->>" +li);
		
		
		boolean b = li.contains("tejal");
		
		System.out.println("conatins method ->>" + b);
		
		
		System.out.println(li.isEmpty());
		
		//retrive data from for loop
		System.out.println("for loop data retribval");
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		
		System.out.println("for ech loop data retrival");
		
		for (Object linkedlistobject : li) {
			System.out.println(linkedlistobject);
			
		}
		
		
		//itertaor method

		System.out.println("by using iterator method");
		Iterator<Object> it = li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
	}
}
