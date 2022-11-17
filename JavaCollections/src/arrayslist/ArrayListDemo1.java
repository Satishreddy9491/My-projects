package arrayslist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	public static void main(String args[] ) {
		/*
		  Declare ArrayListTypes
		   ArrayList al=new ArrayList() == This will store the  HETROGENINOUS data 
		 ArrayList<String> al1=new ArrayList<String> |
		  ArrayList<Integer> al2=new ArrayList<Integer> |This two will create Homogeneous data  
		  */		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("Welcome");
		al.add(18.5);
		al.add('a');
		System.out.println(al); 
		System.out.println(" number of elemnts in array =" + al.size());
		System.out.println(" remove elemnts=" + al.remove(1));
		System.out.println("After the removing the element in ArrayList ="+al); 
		
		//insert the new element in particular position
		al.add(1,"ready");
		System.out.println("After the Inserction the element in ArrayList ="+al);
		
		//retrive specific element in arr
		al.get(1);
		System.out.println(al.get(1));
		
		//change or Replace element or object
		System.out.println(al.set(2,12));
		System.out.println(al);
		
		//serching the element or object
		System.out.println(al.contains(12));
		System.out.println(al.contains(2));
		
		System.out.println(al.isEmpty());
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("reading the elements by using for loop");
		System.out.println();
		// how to read the data using for loop
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println();
		//for each loop
		System.out.println("Using the method is for each loop");
		for(Object e:al) {
			System.out.println(e);
		}
		System.out.println("By using Iterator method");
		
		Iterator a=al.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
	}
}
