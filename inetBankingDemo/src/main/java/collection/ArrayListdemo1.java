package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListdemo1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList(); //conatins hetrogenous data
		
		al.add(100);
		al.add("manoj");
		al.add(true);
		System.out.println(al);
		
		int size=al.size();   //number of elements in the arraylist
		System.out.println(size);
		
		al.add(2,"tejal");    //add elements into particular position
		System.out.println(al);
		 
		al.remove(3);             //remove particular element from list.
		System.out.println(al);
		
		System.out.println(al.get(2)); // Retrieve particular value from list
		
		
		
		al.set(0, 200);                     //replace value of particular position
		System.out.println(al);
		
		
		boolean b=al.contains("manoj");         //contains method
		System.out.println(b);
		
		boolean empty = al.isEmpty();             //arraylist is empty or not 
		System.out.println(empty);
		
		
		//to read value from arraylist we have three method
		
		//forloop
		
		System.out.println("for loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		
		//foreach loop
		System.out.println("for each loop");
		for(Object value:al)
		{
			System.out.println(value);
		}
		
		//Iterator
		System.out.println("iterrator method");
		Iterator at = al.iterator();
		
		while(at.hasNext())
		{
			System.out.println(at.next());
		}
	}
}
