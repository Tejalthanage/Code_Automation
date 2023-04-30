package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		String arr[]= {"dog","cat","man"};
		for (String animal : arr) {
			System.out.println(animal);
			
		}
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		 //System.out.println(Arrays.asList(arr));
		 
		// Collections.sort(Arrays.asList(arr));
		 System.out.println();
	}
}
