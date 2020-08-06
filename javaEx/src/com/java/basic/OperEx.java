package com.java.basic;

// 연산자 연습
public class OperEx {

	public static void main(String[] args) {
		// arithOper();
		// incDecOper();
		//logicalOper();
		//bitOper();
		conditionalOper();
	}

	// 3항 연산자
	public static void conditionalOper() {
		// 논리비교 ? 참인 경우 : 거짓인 경우
		// 장점: 간단한 값의 제어, 코드 가독성을 높일 수 있다
		int a = 10;
		// a가 짝수면 "짝수", 아니면 "홀수" 문자열
		String message = a % 2 == 0 ? "even" : "odd";
		System.out.println("Is a even or odd? >> " + message);
		
		int score = 85;
		// 점수가 80 이상이면 Good
		// 점수가 50점 이상이면 Pass
		// 그렇지 않으면 Fail
		message = score >= 80 ? "Good" : score >= 50 ? "Pass" : "Fail";
		// 3항 연산자 중첩이 가능, 비추천 (if문 사용할 것)
		System.out.println("시험결과: " + message);
	}
	
	
	
	
	// 비트 연산자
	public static void bitOper() {
		// and (&), or (|), not(~)
		// 정수형 데이터를 비트 단위로 제어하는 연산자
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		int result = b1 & b2; // bit and 연산
		System.out.println("bit and 연산 >> " + (Integer.toBinaryString(result)));
		
		result = b1 | b2; // bit or 연산
		System.out.println("bit or 연산 >> " + (Integer.toBinaryString(result)));

		result = ~b1; // bit not 연산
		System.out.println("bit not 연산 >> " + (Integer.toBinaryString(result)));
		System.out.println(result);
		
		// 비트 시프트
		//		<< : 비트를 왼쪽으로 이동 (정수형 2의 배수의 곱)
		//		>> : 비트를 오른쪽으로 이동 (정수형 2의 배수의 나눗셈)

		int val = 1;
		System.out.println("val : " + val);
		// 왼쪽으로 1비트 이동
		System.out.println("val << 1 : " + Integer.toBinaryString(val << 1));
		
		int val2 = 0b100;
		System.out.println("val2 : " + Integer.toBinaryString(val2));
		// 오른쪽으로 2비트 이동
		System.out.println("val2 >> 2 : " + Integer.toBinaryString(val2 >> 2));


	}
	
	
	// 비교, 논리 연산
	public static void logicalOper() {
		// 비교 연산자 >, >=, <, <=, ==, !=

		// 논리연산자 &&(논리곱: AND), ||(논리합: OR), !(논리부정: NOT)

		int n = 5;
		// n은 0초과, 10미만인가?
		//		조건1: n > 0 이고(AND)
		// 		조건2: n < 10
		boolean b1 = 0 < n && n < 10;
		System.out.println("0 < a and a < 10? >> " + b1);
		//System.out.println(0 < n && n < 10);
		
		// n은 0이하이거나, 10이상인가?
		//		조건1: n <= 0 이거나(OR)
		//		조건2: n >= 10
		boolean b2 = n <= 0 || n >= 10;
		System.out.println("a <= 0 or a >= 10? >> " + (n <= 0 || n >= 10));
		
		// !(논리부정)
		System.out.println("not a >> " + !b2);
	
	}

	// 증가, 감소 연산자
	public static void incDecOper() {
		// 순서가 중요
		int a = 5; // a++ 후위연산자
		int b = 5; // ++b 전위연산자

		// 후위연산자
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);

		System.out.println();

		// 전위연산자
		System.out.println(b);
		System.out.println(++b);
		System.out.println(b);
	}

	// 산술연산자
	public static void arithOper() {
		// 사칙연산 : +, -, *, /
		int a = 7;
		int b = 3;
		System.out.println("7 / 3 의 몫: " + (7 / 3));
		// int / int -> int(몫)
		System.out.println("7 / 3 의 나머지: " + (7 % 3));
		// 나머지 연산자 %

		// 정확한 실수값을 얻으려면 int -> float 변환
		System.out.println("7 / 3 실수 :" + ((float) a / (float) b));

		// 만약 정수를 0으로 나누면
		// ArithmeticException
		// System.out.println("정수 나누기0 : " + (a / 0)); Error

		// 실수를 0으로 나눈다
		System.out.println("실수 / 0 => " + (4.0 / 0));
		// 무한대에 산술연산 -> 무한대
		System.out.println("무한대의 산술 => " + (4.0 / 0 + 10));
		// 연산 -> 계산할 수 없는 값(NaN -> Not a Number)
		System.out.println("0.0 / 0.0 => " + (0.0 / 0.0));
		// NaN 포함된 산술 연산 -> NaN(계산 불가)
		System.out.println("NaN 산술 => " + (0.0 / 0.0 + 20));
		// 유한수인지 확인
		System.out.println("유한수의 확인: " + Double.isFinite(4.0 / 0));
		// NaN인지 확인
		System.out.println("NaN 확인 => " + Double.isNaN(0.0 / 0.0));

	}
}
