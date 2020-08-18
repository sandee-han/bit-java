package com.java.oop.summary;

public class KungfuPanda extends Panda implements Kungfu{
	
	//	생성자
	public KungfuPanda(String name, int age) {
		super(name, age);
	}

	//	interface 내의 모든 메서드는 반드시 오버라이드
	@Override
	public void kungfu() {
		System.out.printf("%s: 아뵤~%n", name);
	}
	
	//	추상 메서드는 반드시 Override
	//	say는 Animal의 추상 메서드
	//	-> Panda가 이미 오버라이드 했으므로 override안해도댐
	
	
}
