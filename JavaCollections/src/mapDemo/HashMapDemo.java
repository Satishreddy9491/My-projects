package mapDemo;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String args[]) {
		HashMap m=new HashMap();
		
		m.put(1,"satish");
		m.put(2, 98);
		m.put(3,"reddy");
		m.put(8, "sidda");
		m.put(4, "venkata");
		m.put(5, "siri");
		
		System.out.println(m);
		System.out.println();
		System.out.println(m.get(8));
		System.out.println();
		System.out.println(m.remove(2));
		
		System.out.println(m.containsKey(8));  //--> True or false
		System.out.println();
		
		System.out.println(m.containsValue("jagan"));  
		
		System.out.println();
		
		System.out.println(m.isEmpty());
		
		System.out.println();
		System.out.println(m.keySet());  //--> Returns the all key sets 
		
		System.out.println();
		System.out.println(m.values()); //--> Returns the all the values as a collections
		
		System.out.println();
		
		System.out.println(m.entrySet());  //--> Returns the all entry as a set
		
		for(Object e:m.keySet()) {
			System.out.println(e);
		}
		for(Object u:m.values()) {
			System.out.println(u);
		}
		for(Object y:m.entrySet()) {
			System.out.println(y);
		}
	}
}