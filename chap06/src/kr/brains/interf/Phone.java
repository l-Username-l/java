package kr.brains.interf;

public interface Phone {
	// 인터페이스에 선언된 모든 필드는 정적 최종이다. 즉, 상수 변수이다.
	String PHONE_NUMBER = "010-1588-8282";
	// public state final 이 생략되어있음
	
	
	void call(String phoneNumber);
	void receive();
	
}
