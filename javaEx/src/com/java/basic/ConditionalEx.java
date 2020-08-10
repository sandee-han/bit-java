package com.java.basic;

import java.util.Scanner;

//조건문 연습
public class ConditionalEx {

	public static void main(String[] args) {
		//ifElseEx();
		//ifElseEx2();
		//ifElseEx3();
		//switchEx();
		//switchEx2();
		//whileEx();
		//whileEx2();
		//whileEx3();
		whileEx4();
	}
	
	public static void whileEx4() {
		// 숫자를 입력받아서 합산
		// 0을 입력 받ㅇ면 반복을 종료
		int num = 0;
		int total = 0; // 합산 변수
		Scanner scanner = new Scanner(System.in);
		
		// 최소 1번은 실행해야 하는 반복 -> do ~while 사용
		// 반복 조건이 loop문 내부에서 결정되는 경우 -> do ~while 사용
		do {//일단 실행
			System.out.print("정수 입력.[0이면 종료]: ");
			num = scanner.nextInt();
			total += num;
		}while (num != 0);
		
		System.out.println("합산값: " + total);
		scanner.close();
		
	}
	
	
	public static void whileEx3() {
		// while문은 종료를 위한 제어 변수를 잘 제어하여
		// 무한루프에 빠지지 않도록 해야 한다
		// 경우에 따라서는 의도적으로 무한루프를 사용하기도 한다
		while(true) {
			System.out.println("무한루프... Ctrl + C to Quit");
		}
		
	}
	
	
	public static void whileEx2() {
		// 단수를 입력, 해당 단의 곱셈표를 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("단수를 입력하세요: ");
		int dan = scanner.nextInt();
		int i = 1;
		while(i <= 9) {
			int result = i * dan;
			System.out.println(dan +" * "+i+" = "+result);
			i ++;
		}
		scanner.close();
	}
	
	public static void whileEx() {
		// 반복문을 사용, 1부터 100까지 숫자를 합산하여 출력
		// 개졸림
		
		int num = 1; // 시작값, 조건 비교
		int total = 0;
		while(num <= 100) {
			total += num;
			// 주의: while문은 반복 조건을 개발자가 직접 컨트롤 해 줘야한다
			num += 1;
		}
		System.out.println(total);
	}
	
	
	public static void switchEx() {
		// ifElseEx3와 동일한 내용을 switch로 작성
		// switch는 전달받은 변수의 값을 이용해서 흐름을 제어 (==)
		// case에 break를 잊지 말자
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1:C, 2:C++, 3:Java, 4:Python -");
		int num = scanner.nextInt();
		
		switch(num) {
		case 1: // num == 1
			System.out.println("R101");
			break;
		case 2: // num == 2
			System.out.println("R202");
			break;
		case 3: // num == 3
			System.out.println("R303");
			break;
		case 4: // num == 4
			System.out.println("R404");
			break;
		default: // 그 외
			System.out.println("관리자에게 문의하세요.");
			break;
		}
		scanner.close();
	}
	
	public static void switchEx2() {
		// 월정보(정수) 입력
		// 1, 3, 5, 7, 8, 10, 12 -> 31일
		// 2 -> 28일
		// 2, 4, 6, 9, 11 -> 30일
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("월 입력: ");
		int month = scanner.nextInt();
		String days = ""; // 결과를 저장할 변수
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = "31일";
			break;
		case 2:
			days = "28일";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = "30일";
			break;
		default:
			days = "?";
		}
		System.out.println(days);
		scanner.close();
	}
	
	
	
	public static void ifElseEx3() {
		// 과목 번호 입력
		// 1 -> R101, 2 -> R202, 3 -> R303, 4 -> R404
		// 나머지 -> 관리자 문의
		Scanner scanner = new Scanner(System.in);
		System.out.print("1:C, 2:C++, 3:Java, 4:Python -");
		int num = scanner.nextInt();
		
		if(num == 1){
			System.out.println("R101");
		} else if(num == 2) {
			System.out.println("R202");
		} else if(num == 3) {
			System.out.println("R303");
		} else if(num == 4) {
			System.out.println("R404");
		} else {
			System.out.println("나머지는 관리자에게 문의하세요.");
		}
		
		scanner.close();
	}
	
	
	public static void ifElseEx2() {
		// 정수 입력
		// 0보다 크면 양수, 0이면 0, 0보다 작으면 음수
		// if ~ else if ~ else
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력: ");
		int num = scanner.nextInt();
		
		/*
		if(num > 0) 
			System.out.println("양수입니다.");
		else if(num == 0) 
			System.out.println("0 입니다. ");
		else 
			System.out.println("음수입니다.");
		
		System.out.println("\n개졸립니다.");
		*/
		
		// 중첩 if문 : 1차로 필터링
		// 		내부 블록 안쪽에서 2차로 조건 판별
		if(num==0){
			// num = 0
			System.out.println("0 입니다. ");
		}
		else {
			// num != 0
			if(num > 0) {
				// 양수
				System.out.println("양수입니다.");
			}
			else {
				// 음수
				System.out.println("음수입니다.");
			}
		}
		
		
		
		scanner.close();
	}
	
	
	
	public static void ifElseEx() {
		// Scanner로 정수를 입력
		// 점수가 60점 이상이면 "합격"
		// 그렇지 않으면(60점 미만) "불합격"
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		// 판별(의사 결정)
		if(score >= 60) {
			System.out.println("합격");
			// 비교 값이 true일 때 실행
		} else {
			// 비교 값이 false일 때 실행
			System.out.println("불합격");
		}
		scanner.close();
	}

}
