package com.java.thread.v1;

//	Process : 실행중인 하나의 프로그램
//	Thread : Process 내에서 실행되는 하나의 작업 흐름
//	하나의 Process가 실행되면 MainThread가 하나 생성
public class MainThread {

	public static void main(String[] args) {
		//	MainThread와 별도로 다른 작업흐름이 필요
		//	Thread를 생성하여 실행
		Thread thread1 = new DigitThread();
		thread1.setName("DigitThread");
		//	Thread의 시작 : Runnable -> Running
		thread1.start();	//	thread 내부의 run 메서드는 직접 호출하지 않음 (우회접근)
		//	MainThread의 로직
		//	A부터 Z까지 0.3초 간격으로 출력
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("MainThread:" + ch);
			//	0.3초 대기
			try {
			Thread.sleep(300);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
