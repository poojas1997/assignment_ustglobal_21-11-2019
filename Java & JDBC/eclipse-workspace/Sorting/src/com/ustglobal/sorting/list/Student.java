package com.ustglobal.sorting.list;

public class Student implements Comparable<Student> {

	int id ;
	String name;
	double percentage;

	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}



//	@Override
//	public int compareTo(Student s) {
//		if(this.id > s.id) {
//			return 1;
//		}else if(this.id < s.id) {
//			return -1;
//		}else {
//			return 0;
//		}
		
//		if(this.percentage > s.percentage) {
//			return 1;
//		}else if(this.percentage < s.percentage) {
//			return -1;
//		}
//		return 0;
		
//		String p = this.name.toUpperCase() ;
//		String q = s.name.toUpperCase();
//		
//		return p.compareTo(q);
	
	@Override
	public int compareTo(Student s) {
		
//		int i = this.id;
//		int j = this.id;  Dont do this
		
		
		Integer i = this.id;
		Integer j = s.id;
		return i.compareTo(j);
	}
		
	}
