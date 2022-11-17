package linkedlistDemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {
	public static void main(String args[]) {

		/*
		 * Declare LinkedListTypes LinkedList al=new LinkedList() == This will store the
		 * HETROGENINOUS data LinkedList<String> al1=new LinkedList<String> |
		 * LinkedList<Integer> al2=new LinkedList<Integer> |This two will create
		 * Homogeneous data
		 */
		LinkedList al = new LinkedList();
		al.add("x");
		al.add("Welcome");
		al.add("185");
		al.add("kjvh");
		Collections.sort((al));
		System.out.println("Sorting the elemnts"+al);
		System.out.println(al);
		System.out.println(al);
		System.out.println(" number of elemnts in array =" + al.size());
		System.out.println(" remove elemnts=" + al.remove(1));
		System.out.println("After the removing the element in LinkedList =" + al);

		// insert the new element in particular position
		al.add(1, "ready");
		System.out.println("After the Inserction the element in LinkedList =" + al);

		// retrive specific element in arr
		al.get(1);
		System.out.println(al.get(1));

		// change or Replace element or object
//		System.out.println(al.set(2, 12));
//		System.out.println(al);

		// serching the element or object
		System.out.println(al.contains(12));
		System.out.println(al.contains(2));

		System.out.println(al.isEmpty());

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("reading the elements by using for loop");
		System.out.println();

		System.out.println();
		System.out.println();
		Collections.sort((al));
		System.out.println(al);

		// how to read the data using for loop

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println();
		// for each loop
		System.out.println("Using the method is for each loop");
		for (Object e : al) {
			System.out.println(e);
		}
		System.out.println("By using Iterator method");

		Iterator a = al.iterator();
		while (a.hasNext()) {
			System.out.println(a.next());
		}
		
		
	}
}