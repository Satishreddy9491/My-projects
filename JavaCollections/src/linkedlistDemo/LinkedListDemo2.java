package linkedlistDemo;

import java.util.LinkedList;

public class LinkedListDemo2 {
	public static void main(String args[]) {
		LinkedList l=new LinkedList();
		l.add("Dog");
		l.add("Cow");
		l.add("Car");
		l.add("Bike");
		l.add("Watch");
		l.add("Laptop");
		
		System.out.println("before adding the elements = "+l);
		
		System.out.println();
		System.out.println();
		
		l.addFirst("man");
		l.addLast("Phone");
		System.out.println("After adding the elements = "+l);
		
		System.out.println("get First the elements = "+l.getFirst());
		System.out.println("get last the elements = "+l.getLast());
		
		System.out.println("removing  first the elements = "+l.removeFirst());
		System.out.println("removing  last the elements = "+l.removeLast());

		System.out.println("After removing the elements = "+l);

	}
}
