package kr.brains.api;

public class Car {
	private double speed;
	public void speedUp() {
		speed = speed *(1 + Math.random());
		// Math 클래서 : 수학관련
		System.out.println("속도 증가" + speed);

	}

}
