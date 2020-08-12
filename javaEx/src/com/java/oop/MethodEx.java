package com.java.oop;

public class MethodEx {

	public static void main(String[] args) {
		System.out.println("sum: " + sum(10,20));
		// static에서 메서드를 호출하려면 호출하려는 메서드도 static이어야 한다
		printMessage("Java Method 연습");
//		sum(10, 20, 30, 40, 50); // 인수들이 배열 형태로 변환되어 전달
//		System.out.println("가변인수 연습: " + sum(10, 20, 30, 40, 50));
		printSum("고정인수 + 가변인수 연습: ",10, 20, 30, 40, 50);
	}
	
	//	sum: 메서드 이름, double a, double b: 파라미터
	private static double sum(double a, double b) {
		return a + b; // 데이터는 double이어야 한다.
	}

	//	가변인수, 고정인수를 함께 사용 가능		String message: 고정인수	, double...values: 가변인수
	//	순서 : 고정인수 -> 가변인수
	private static void printSum(String message, double ...values) {
		double total = sum(values);
		System.out.println(message + ": " + total);
	}
	
	//	가변인수
	private static double sum(double ...values) {
		System.out.println("인수의 갯수: " + values.length);
		double total = 0;
		for(double val: values) { // 향상된 for문
			total += val;
		}
		return total;
	}
	
	
	private static void printMessage(String message) {
		// return할 데이터가 없으면 void
		System.out.println(message);
	}
	
}
