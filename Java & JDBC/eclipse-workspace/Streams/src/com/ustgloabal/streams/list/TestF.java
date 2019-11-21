package com.ustgloabal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {
	public static void main(String[] args) {

		ArrayList<Integer> al =new ArrayList<Integer>();

		al.add(20);
		al.add(23);
		al.add(5);
		al.add(12);
		al.add(4);
		al.add(24);
		
		List<Integer> l = al.stream().sorted().collect(Collectors.toList());
		
//		for(Integer L : l) {
//			System.out.println(L);
//		}
		
		Iterator<Integer> i = l.iterator();
		while(i.hasNext()) {
			Integer I = i.next();
			System.out.println(I);
		}
	}
}
