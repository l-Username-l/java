package kr.brains071;

import java.lang.Number;

public class NewNumber extends Number{
	/*
	public short shortvalue() { //overriding
		return -1;
	}
	*/
	private int value;
	
	public NewNumber(int i) {
		value = i;
	}
	
	public byte byteValue() {//재정의
		System.out.println("재정의 해보았습니다." + super.byteValue());
		return (byte) value;
	}
	
	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	} //추상클래스를 상속
	// 추상 클래스 : 추상 메소드를 하나 이상 가지고 있는 클래스
	// 추상 메소드 : abstract 예약어와 메소드 선ㅓㄴ(사용법)만을 갖는 메소드
	// 상속 받은 클래스에서 구현해야 함을 명시하는 역할
	// 클래스 : 모든 메소드가 구현된 상태

		


}
