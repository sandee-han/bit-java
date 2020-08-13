package com.java.oop.staticmembers;

public class StaticExApp {
	
	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		//	첫번째 로딩: static 블록 수행 -> 생성자 호출
		//	refCount는 static -> 인스턴스 생성 없이 접근 가능
		System.out.println("RefCount: " + StaticEx.refCount);
		
		StaticEx s2 = new StaticEx();
		//	앞에서 static 초기화 완료: static 블록 수행X -> 생성사 호출
		System.out.println("RefCount: " + StaticEx.refCount);
		
		s1 = null;	//	참조 해제
		System.out.println("s1 해제");
		System.out.println("RefCount: " + StaticEx.refCount);
		
		//	GarbageCollector 강제 수행
		//	주의: 직접 GarbageCollector를 호출하지 않도록 하자
		//	작동원리를 이해하기 위한 호출이니 앞으로는 사용하지 말자.
		System.gc();
		//	잠시 대기
		try {
			Thread.sleep(3000);
			System.out.println("RefCount: "+ StaticEx.refCount);
		} catch (Exception e) {
			
		}
	}
}
