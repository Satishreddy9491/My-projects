package arrayslist;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String args[]) {
		ArrayList a=new ArrayList();
		a.add("x");
		a.add("y");
		a.add("z");
		a.add("a");
		a.add("b");
		a.add("c");
		System.out.println("I am in arrayList");
		System.out.println(a);
		
		ArrayList a1=new ArrayList();
		a1.addAll(a);
		a1.add("I am in duplicate arrayList");
		System.out.println("I am in duplicate arrayList");
		System.out.println(a1);
		
		System.out.println();

		System.out.println("Remove the elemets in the arraylist ="+a1.removeAll(a1));
		System.out.println(a1);
		
		
	}
	
	
}
