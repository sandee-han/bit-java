package com.java.oop.casting;

public class Cat extends Animal {
	//	name field, eat, walk 상속
	
	//	생성자
	public Cat(String name) {
		super(name);	//	부모의 생성자
	}
	
	//	자신만의 메서드
	public void meow() {
		System.out.println(name+": 야옹");
	}
	
	
}
