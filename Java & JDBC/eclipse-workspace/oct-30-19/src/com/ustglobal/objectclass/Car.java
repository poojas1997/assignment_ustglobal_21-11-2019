package com.ustglobal.objectclass;

public class Car {

	int cost;
	String brand;
	String Color;
	
	public Car(int cost, String brand, String color) {
		super();
		this.cost = cost;
		this.brand = brand;
		this.Color = color;
	}
	
	@Override
	public int hashCode() {
		return cost;
	}

	@Override
	public String toString() {
		return "Car [cost = " + cost + ", brand = " + brand + ", Color = " + Color + "]";
	}
	
}
