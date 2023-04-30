package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList al=new ArrayList();
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("A");
		al.add("B");
		
		ArrayList al_dup=new ArrayList();
		al_dup.addAll(al);
		
		System.out.println(al_dup);
		
		ArrayList al_dup2=new ArrayList();
		al_dup2.add("manoj");
		al_dup2.addAll(al_dup);
		System.out.println(al_dup2);
	//	al_dup2.removeAll(al_dup);
		//System.out.println(al_dup2);
		
		//sort element in arraylist
		
		System.out.println("elements in the arrylist"+al);
		
		Collections.sort(al);
		System.out.println("elemts in the arrylist after sorting"+ al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("reverse orde"+ al);
	}
}
