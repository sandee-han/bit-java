package com.java.api.objectclass.v4;


//	v4
//	복제: object.clone() 메서드를 사용
//		-> Cloneable 인터페이스를 구현해야 clone() 메서드 사용가능
public class Point implements Cloneable{
	//	상속받은 클래스에서도 접근할 수 있도록 protected로 제한을 낮춤
	protected int x;
	protected int y;
	
	//	사용자 정의 생성자가 있을 경우
	//	JVM은 기본 생성자를 만들지 않는다
	public Point() {
		
	}
	//	사용자 정의 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point 생성자");
	}
	//	Getters, Setters
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//	메서드
	public void draw() {
		System.out.printf("점 (%d, %d)을 그렸습니다.%n",x ,y);
	}
	
	//	메서드 오버로딩
	//	같은 리턴타입과 같은 이름을 가졌지만
	//	매개변수의 종류, 갯수, 순서만 다른 메서드
	public void draw(boolean show) {
		//	show : true -> 그렸습니다
		//		   false -> 지웠습니다
		
		//	3항 연산
		String message = show ? "그렸습니다" : "지웠습니다";
		//	TODO: -> if문 버전으로 해보기
		System.out.printf("점 (%d, %d)을 %s%n" ,x ,y ,message);
	}
	
	//	toString : 출력코드 혹은 문자열과의 연결시 호출되어서 내용을 문자열로 반환
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";	//	출력 포맷
	}
	
	//	equals : 내부 값이 같은지 점검 로직 작성
	@Override
	public boolean equals(Object obj) {
		//	Object를 point로 다운캐스트
		if(obj instanceof Point) {	//	클래스 체크
			//	다운캐스트 가능
			Point other = (Point)obj;
			return this.x == other.x && this.y == other.y;
		}
		return super.equals(obj);
	}
	
	public Point getClone() {
		Point clone = null;
		
		try {
			clone = (Point)clone(); //	object객체 반환이므로 다운캐스팅
		} catch(CloneNotSupportedException e) {
			System.err.println("복제 불가 객체!");
		}
		
		return clone;
	}
	
	
}








