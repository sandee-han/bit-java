package com.java.thread.synchronize;

//	여러 Thread에서 공유하는 참조 객체
public class SharedMemory {
	private int memory;

	
	public int getMemory() {
		return memory;
	}

	//	임계 영역: MultiThread 프로그램에서 단 하나의 Thread만 실행할 수 있는 코드
	//	임계영역 지정을 위해서는 메서드 선언부에 Synchronized 키워드 부여
	//	Synchronized 메서드가 수행되면 객체 잠금상태가 된다
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			//	잠시 대기
			Thread.sleep(1000);	//	1초 대기
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
	
	
	

}
