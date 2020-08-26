package com.java.thread.v2;

//	WorkingThread를 만드는 방법 1
//	Thread 상속 구현
public class DigitThread extends Thread {

	@Override
	public void run() {
		//	Thread의 로직에 run 메서드를 오버라이드해서 추가
		//	주의: run메서드를 직접 호출하면 MultiThread가 아님
		//		start메서드를 이용하여 우회접근
		//	숫자를 0부터 30까지  1씩 증가하며 출력, 0.3초 대기
		for(int i = 0; i<=30; i++) {
			System.out.printf("%s: %d%n", getName(), i);	//	getName -> Thread의 메서드
			try {
				Thread.sleep(300);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}
	
}
