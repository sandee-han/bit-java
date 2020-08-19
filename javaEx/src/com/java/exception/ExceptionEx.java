package com.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
//		arithmeticExceptionEx();
//		indexOutofBoundEx();
		nullPointerExceptionEx();
	}
	
	private static void indexOutofBoundEx() {
		int[] intArray = new int[] {3, 6, 9};
		
		System.out.println("배열의 길이: " + intArray.length);
		
		//	*** 가장 마지막 인덱스 == length - 1 ***
		try {
		//	예외 가능 코드 블락 -> try
		System.out.println(intArray[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("예외 메세지: " + e.getMessage());
		} 
		//	finally는 생략 가능
		System.out.println("End of code");	
	}
	
	//	가장 흔히 발생하는 예외
	private static void nullPointerExceptionEx() {
		String s = "Hello";	//	참조 객체
		
		s = null;	//	참조 해제
		
		try {
		//	예외 가능 블록
		System.out.println(s.toUpperCase());
		} catch (NullPointerException e) {
			System.err.println("예외 메세지: "+ e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("End of Code");
		
		
	}
	
	
	
	private static void arithmeticExceptionEx() {
		//	스캐너로부터 정수 하나를 입력
		//	0으로 나눠보자
		
		Scanner scn = new Scanner(System.in);
		double result = 0;
		int num;
		
		System.out.print("정수를 입력하세요: ");
		
		try {
		//	예외가 발생할 수 있는 영역 -> try
		num = scn.nextInt();
		result = 100 / num;
		} catch(ArithmeticException e) {
			//	메세지가 담겨 있다.
			System.err.println("예외 메세지: " + e.getMessage());
		} catch(InputMismatchException e) {
			System.err.println("정수만 입력해주세요.");
			//	예외 상황 전체를 확인하고자 한다면
			e.printStackTrace();
		} catch(Exception e) {
			//	catch문의 마지막에는 Exception 객체로 남아있을지 모를 예외를 처리
			e.printStackTrace();
		} finally {
			//	예외 유무 관계 없이 항상 마지막에 수행
			//	자원 정리 작업 등에 활용
			System.out.println("Finally");
		}
		
		System.out.println("결과: "+ result);
		scn.close();
		
		
	}
	
}




