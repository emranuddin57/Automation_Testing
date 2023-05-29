package com.usa.inheritance;

public class InterFaceRegularClass implements InterfaceAA,InterFaceBB {
	
	public void getJob() {
		System.out.println("Emran need IT job badly");
	}

	
	public void getpropertiesBB() {
		System.out.println("I am from interface BB");
		
	}

	
	public void getPropertiesAA() {
		
		System.out.println("I am from interface AA");
	}
  public static void main(String[] args) {
	  InterFaceRegularClass obj = new InterFaceRegularClass();
	  obj.getPropertiesAA();
	  obj.getpropertiesBB();
}
}
