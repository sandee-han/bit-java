package com.java.thread.v2;

//	Thread 생성 두번째 방법: Runnable 인터페이스 구현
//	getName 등 다른 메서드 사용 불가
//	Thread의 로직만 사용할 경우
public class AlphabetRunnable implements Runnable{

	@Override
	public void run() {
		//	Thread 내부의 start 메서드에서 호출될 Thread의 로직
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("AlphabetRunnable:" + ch);
			//	0.3초 대기
			try {
			Thread.sleep(300);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
