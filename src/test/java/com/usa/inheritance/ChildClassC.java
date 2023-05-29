package com.usa.inheritance;

public class ChildClassC extends ParentsB{
	public void getCar() {
		System.out.println("Child Property -> Rakib has a car 2024 model BMW M");
	}

	public static void main(String[] args) {
		ChildClassC obj = new ChildClassC();
		obj.getCar();
		obj.getGrandParentProperties();
		obj.getMarried();

	}
}



