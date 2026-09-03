package chapter3;

/**
 * @author VIJAYAKUMAR
 * @see		java.util.ArrayList
 * @version 1.0
 */

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] str) {
		
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add("welcome");
		ar.add(12.34);
		ar.add(true);
		
		Annoat1 an1 = new Annoat1();
		ar.add(an1);
		
		
		System.out.println(ar.get(1));
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//while loop
		Iterator ite = ar.iterator();
		while(ite.hasNext()) { //hasNext() is used to check element existence
			
			Object ob = ite.next(); // retrieve elements from iterator object
			System.out.println(ob);
		}
		
		
		ar.add(2,"java");
		System.out.println(ar);
		
		ar.remove("welcome");
		System.out.println(ar);
		
		System.out.println(ar.contains("hello"));
		
		int pos = ar.indexOf(12.34);
		System.out.println(pos);
		
		
		List<String> lst = new ArrayList();
		
		//lst.add(100);
		lst.add("welcome");
		 
	}
}








