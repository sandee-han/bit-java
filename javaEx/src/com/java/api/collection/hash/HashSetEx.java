package com.java.api.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
//		basicHashSet();
		customHashSet();
	}

	private static void customHashSet() {
		//	사용자 정의 클래스의 Hash 자료형에서의 사용
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student(10, "홍길동");
		Student s2 = new Student(20, "장길산");
		Student s3 = new Student(10, "홍길동");

		//	추가
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println("학생 명부: "+ hs);

		//	해시코드의 확인
		System.out.println("s1의 hashcode: " + s1.hashCode());
		System.out.println("s3의 hashcode: " + s3.hashCode());
		
		System.out.println("s1의 haseCode와 s3의 hashCode비교: " + (s1.hashCode() == s3.hashCode()));
		System.out.println("s1 값과 s3 값의 비교: " + s1.equals(s3));
	}

	private static void basicHashSet() {
		// HashSet
		// 순서가 중요하지 않고, 중복을 허용하지 않는 집합으로서의 자료형
		HashSet<String> hs = new HashSet<>();

		// 객체의 추가: add
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java"); // 중복 데이터 - 삽입되지 않음

		System.out.println("SET: " + hs);
		System.out.println("SET의 크기: " + hs.size());

		// 포함 여부의 확인 : contains
		System.out.println("C++를 포함하는가? : " + hs.contains("C++"));
		System.out.println("Linux를 포함하는가? : " + hs.contains("Linux"));

		// 삭제 : 인덱스가 없으므로 객체 삭제만 가능
		hs.remove("C++");
		System.out.println("SET: " + hs);

		hs.remove("C++");
		System.out.println("SET: " + hs);

	}

}
