package com.ustglobal.arrays;

public class TestB {
public static void main(String[] args) {
	
	int[] nums = {10,20,30,40};
//	System.out.println(nums[10]);    ArrayIndexOutOfBoundException
	receive(nums);
	int[] values = getArray();
	
	for(int val : values) {
		System.out.println(val);
	}
	System.out.println("============");
	
	

}

static void receive(int[] numbers) {
	for(int num : numbers) {
		System.out.println(num);
	}
	System.out.println("============");

}

static int[] getArray() {
	int[] values = {20,30,40,50};
	return values;
}


	
}



