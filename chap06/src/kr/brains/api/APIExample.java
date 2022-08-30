package kr.brains.api;

public class APIExample {

	public static void main(String[] args) {
		
		Overriding over = new Overriding();
		Integer i1 = new Integer("비즈니스 분석가");
		Integer i2 = new Integer("비즈니스 분석가");
		if(i1==i2)
			System.out.println("true");
		else
			System.out.println("false");
		over.testEquals(i1, i2);
		
		Object o1 = new Object();
		Object o2 = new Object();
		if(o1==o2)
			System.out.println("true");
		else
			System.out.println("false");
		System.out.println(o1. hashCode());
		System.out.println(o2. hashCode());
		over.testEquals(o1, o2);
		
		// shift 연산은 비트단위 연산
		// 128을 비트패턴 1000 0000 왼쪽으로 세 번 밀기
		// -> 0001 0000
		// 1번 밀 때마다 2로 나누는 효과가 있다.
		System.out.println(Integer.toBinaryString(128));
		System.out.println(128 >> 3);
		System.out.println(128 << 3);
	
		Integer intRef  = new Integer(100);
		try { //예외처리문장
			Integer intRef2  = Integer.valueOf("100L");
		} catch (NumberFormatException nfe) {
			System.out.println("에외발생 처리 : " + nfe.getMessage());
		}
		Integer intRef3  = (Integer) 100;
		System.out.println("에뫼처리 후 : " + intRef3);
		// wrapper class : auto boxing
		
	}

}
