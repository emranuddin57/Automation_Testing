package com.usa.inheritance;

public class ParentsB extends GrandParentA {

	void getMarried() {
		System.out.println("Parents Property -> Alam got married");
	}

	public static void main(String[] args) {
		ParentsB obj = new ParentsB();
		obj.getMarried();
		obj.getGrandParentProperties();

	}

}

