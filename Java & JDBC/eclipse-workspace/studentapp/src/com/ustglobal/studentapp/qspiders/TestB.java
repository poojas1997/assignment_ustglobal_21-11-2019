package com.ustglobal.studentapp.qspiders;

import static com.ustglobal.studentapp.jspiders.Remote.*;
import com.ustglobal.studentapp.jspiders.*;

import com.ustglobal.studentapp.jspiders.Remote;

public class TestB {
	public static void main(String[] args) {
		on();
		System.out.println(num);
		
		Remote r = new Remote();
		r.off();
		System.out.println(r.sum);

	}
}
