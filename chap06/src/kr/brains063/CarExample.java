package kr.brains063;

public class CarExample {
	String programname = "CarExample";
	
	public static void main(String[] args) {
		CarExample ce = new CarExample();
		System.out.println(ce.programname);
		
		// setget() 정적 메소드가 아니므로 객체 생성 후 접근 가능
		// System.out.println("현재 모델 : " + Car.setgas("80"));
		// Car.MODEL = "전기차";
		System.out.println("현재 모델 : " + Car.MODEL);
		System.out.println("가장 큰 int값 : " + Integer.MAX_VALUE);
		int i = 1_000_000_000;
		
		Car car = new Car(); //객체 생성
		// car.MODEL = "전기차"; // 직접 인스턴스 변수 지정	
		car.setGas("70L"); // setter 를 이용한 값 배정 : "30L" 문자열
		// 검증된 값 배정
		// car.gas = 61;
		System.out.println("현재 gas " + car.getGas());
		
		car.run();
		/*String str = "현대자동차";
		System.out.println(str.charAt(4));
		int i = 66;
		// Integer : int 기본형을 효과적으로 조작하기 위해 정의한 클래서
		// Wrapper Class : 기본자료형을 효과적으로 조작하기 위해 정의한 클래스
		System.out.println(Integer.toHexString(1));
	*/
	}
}
