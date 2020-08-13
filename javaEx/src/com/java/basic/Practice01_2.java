package com.java.basic;

import java.util.Scanner;

public class Practice01_2 {

	public static void main(String[] args) {
//		quiz1();
		quiz2();
	}

	public static void quiz1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		int forcase = num%2;
		int total = 0;
		switch(forcase) {
		case 0: for(int i = 0; i <=num; i+=2) {
			total += i;
		}
			break;
		case 1: for(int i = 1; i <=num; i+=2) {
			total += i;
		}
			break;

		default:
		}
		System.out.printf("결과값: %d", total);
	}
	
	public static void quiz2() {
		int check = 0;
		int randnum = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("=============================\n"
				+ "     숫자맞추기 게임 시작      \n=============================");
		System.out.print(">>");
		while(check == 1) {
			System.out.print(">>");
			int num = scanner.nextInt();
			if(num == randnum) {
				check = 1;
			}
			else if(num <= randnum) {
				System.out.println("더 높게");
			}
			else {
				System.out.println("더 낮게");
			}
		}
		
		
	}
	
}
