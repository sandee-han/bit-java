package com.java.basic;

import java.util.Scanner;

public class Practice01_1 {

	public static void main(String[] args) {
//		quiz1();
//		System.out.println("------------------------");
//		quiz2();
//		System.out.println("------------------------");
//		quiz3();
//		System.out.println("------------------------");
//		quiz4();
//		System.out.println("------------------------");
		quiz5();
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
		int num;
		for(int i = 1; i<=10; i++) {
			num = i;
			for(int j = 1; j<=10; j++) {
				System.out.print(num + "\t");
				num++;
			}
			System.out.println();
		}
	}
	
	public static void quiz5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		int num1 = scanner.nextInt();
		System.out.print("숫자: ");
		int num2 = scanner.nextInt();		
		System.out.print("숫자: ");
		int num3 = scanner.nextInt();		
		System.out.print("숫자: ");
		int num4 = scanner.nextInt();		
		System.out.print("숫자: ");
		int num5 = scanner.nextInt();	
		
		if(num1 >= num2) {
			num2 = num1;
		}
		if(num2 >= num3) {
			num3 = num2;
		}
		if(num3 >= num4) {
			num4 = num3;
		}
		if(num4 >= num5) {
			num5 = num4;
		}
		System.out.printf("최대값은 %d입니다.", num5);
	}
	
	
}
