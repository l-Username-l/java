package kr.brains.interf;

public class SmartPhoneExample {
	// 인터페이스를 정의하고, 다중 구현을 통해 클래스를 정의
	// 정의한 클래스로부터 객체르 생성하고
	// 생성된 객체와 상호작용을 통해 문제를 해결
	
	// java는 다중 상속은 지원하지 않음. 즉 extends 뒤에 하나만 나타남
	// 인터페이스는 다중 구현이 가능함, 즉 implements 뒤에 여러개가 나타날 수 있음
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.call(SmartPhone.PHONE_NUMBER);
		sp.playMusic("번개맨송");
		sp.sendMassage("010-1588-8282", "아! 꽃같다!");
		Timer t = sp; // sp가 참조하는 객체를 Timer 인터페이스에 구현한 구현체
	}

}
