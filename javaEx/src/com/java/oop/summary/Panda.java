package com.java.oop.summary;

public class Panda extends Animal {
	//	생성자
	public Panda(String name, int age) {
		//	부모 생성자 호출
		super(name, age);
	}

	@Override
	public void say() {
		//	abstract method이므로 반드시 오버라이드
		System.out.println("zzz....");
	}

	
	//	우클릭 -> source ->overide/implement methods
	
	
	
	
}







