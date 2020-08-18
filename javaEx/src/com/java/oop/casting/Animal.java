package com.java.oop.casting;

public class Animal {
	//	field
	protected String name;	//	 물려줬을때 자식도 사용가능
	
	//	생성자
	public Animal(String name) {
		this.name = name;
	}
	
	//	method
	public void eat() {
		System.out.println(name + "is eating");
	}
	
	public void walk() {
		System.out.println(name + "is walking");
	}
	
}
