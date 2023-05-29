package com.usa.inheritance;

public class GrandParentA {
	
	protected void getGrandParentProperties() {
		System.out.println("GrandParent property -> Land Property");
	}
	public static void main(String[] args) {
		
		GrandParentA obj = new GrandParentA();
		obj.getGrandParentProperties();
	}
	

}
