package com.java.api;

public class WrapperEx {

	public static void main(String[] args) {
		//	Wrapper클래스 생성
		//	객체지향 -> 참조타입 요구 -> null값이 필요할 경우
		Integer i = new Integer(2020);	//	primitive type 객체로 넘어옴
		Character c = new Character('c');
		//	위의 방식은 JDK 9에서 Deprecated
		Float f = Float.valueOf(3.14159f);
		Boolean b = Boolean.valueOf(true);
		
		//	기본 타입은 비어있을 수 없고(null을 허용 안함)
		//	Wrapper 타입은 비어있을 수 있다.(null 허용)
//		b2 = null;  //	에러남
		b = null;
		
		//	활용
		//	문자열로 된 데이터를 변환할 때 활용
		Integer i2 = Integer.valueOf("2020");
		//	주의 : valueOf 내부의 문자열 인자의 형태가 해당 데이터 타입으로 변환할 수 있는 형태이어야 한다.
		
		//	내부 포장된 값의 비교
		System.out.println("i의 값: " + i.intValue());
		System.out.println("i와 i2의 값이 같은가? : " + (i.intValue() == i2.intValue()));
		
		//	JDK 5 이후에는 자동 박싱, 자동 언박싱이 지원
		Float f2 = 3.14159f;
		
		//	parse 계열 메서드 : 주로 변환 작업에 활용
		System.out.println("문자열 -> 정수형으로 변환 : " + Integer.parseInt("-12345"));
		
		//	진법 변환
		System.out.println("16진수 FF -> 10진수 : " + Integer.parseInt("FF", 16));
		
		//	형변환
		System.out.println("f2 -> int : " + f2.intValue());
		
		//	언박싱 비교 2번째	->	자동 언박싱 되지 안음
		//	어쨌든 다른 메모리를 차지
		System.out.println("i와 i2가 같은가? : " + (i == i2));
		
		//	equals를 이용한 값의 비교
		System.out.println("i와 i2의 값이 같은가? : " + i.equals(i2));

	}

}


