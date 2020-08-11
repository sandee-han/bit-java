package com.java.basic;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
//		quiz1();
//		System.out.println("------------------------");
//		quiz2();
//		System.out.println("------------------------");
//		quiz3();
//		System.out.println("------------------------");
	}

	public static void quiz1() {
		for(int i=1; i <= 100; i++) {
			if(i % 5 == 0 && i % 7 ==0) {
				System.out.println("problem01");
				System.out.println(i);
			}
		}
	}
	
	public static void quiz2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void quiz3() {
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j<=9; j++) {
				System.out.print(j + "*"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}
		
	}
	
	public static void quiz4() {
		for(int i = 1; i<=10; i++) {
		//	for(int j = 1; j<=)
		}
	}
	
	
}
