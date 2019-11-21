package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(12);
		hs.add(45);
		hs.add("Pooja");
		hs.add(56.8);
		hs.add(12);
		hs.add(null);

		System.out.println("==========Using for each==========");
		
		for(Object o : hs) {
			System.out.println(o);
		}
		
		System.out.println("=========Using Iterator=========");
		
		Iterator i = hs.iterator();
		while(i.hasNext()) {
			Object s = i.next();
			System.out.println(s);
		}
	}
}
