package com.java.api.objectclass.v5;

import java.util.Arrays;

//	v5.	참조 타입 필드를 가진 객체의 복사(깊은 복제)
public class Scoreboard implements Cloneable {
	//	필드: 참조타입
	//	깊은 복제를 위해서는 참조 타입 필드도 복제해주어 분리해줘야 한다
	private int scores[];	//	정수 배열
	
	//	생성자
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	//	복제 메서드
	public Scoreboard getClone() {
		Scoreboard clone = null;
		
		try {
		clone = (Scoreboard)clone();	//	 <- checked exception
		} catch(CloneNotSupportedException e) {
			System.err.println("복제를 지원하지 않습니다.");
		}
		return clone;
	}

	//	출력을 위한 toString 오버라이드
	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}

	//	필드 복제
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Scoreboard clone = (Scoreboard)super.clone();	//	부모의 클론메서드로 Object의 얕은복제
		//	내부 참조 필드를 복제
		clone.scores = Arrays.copyOf(scores, scores.length);	//	새로운 배열을 만들고 clone의 scores에 복제
		return clone;
	}
	
	
	
}






