package com.java.api.generics.v2;

//	v2. Generics : 매우 중요
//	타입 파라미터 : T -> Type

//	 많이 사용하는 타입 파라미터 관례
//	R: Return Type
//	K: Key
//	V: Value
//		-> 어겨도 상관 없으나 가급적 지키도록 합시다

//	설계시에 타입을 결정하지 않고, 인스턴스화 할 때 내부 사용 타입을 지정하는 방식 -> Generics
public class Box<T> {
	T content;	//	모든 클래스의 부모 -> 뭐든지 다 들간다잉

	//	Getters / Setters
	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	
}
