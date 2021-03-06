package com.java.thread.v2;

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
		
		//	Runnable을 이용한 WorkingThread
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.start();
		
		//	MainThread가 종료되면 WorkingThread를 통제할 수 없게 되므로
		//	WorkingThread의 흐름을 MainThread의 흐름에 합류시켜 줘야한다
		
		try {
			thread1.join();	//	MainThread 흐름에 합류
			thread2.join();	//	MainThread 흐름에 합류
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		//	MainThread의 로직
		System.out.println("MainThread 종료");
	}

}
