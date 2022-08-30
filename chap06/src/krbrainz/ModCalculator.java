package krbrainz;

// 상속(Inheritance) : 상속 허가만 되어 있는 경우에만 사용가능
public class ModCalculator extends Calculator {
	// 생성자는 아무 생성자도 정의하지 않은 경우 컴파일러가 기본 생성자를 정의해줌
	// 생성자가 하나 이상 존재하는 경우 컴파일러는 기본 생성자를 정의하지 않음
	
		public ModCalculator() {
			// this : 클래스로부터 생성된 객체 자신을 가리키는 예약어
			// 인스턴스 변수나 메소드를 접근할 때 사용
			// 변수 : 기억 공간에 대한 식별자 - 기본형, 참조형
			// 스코프(scope) : 유효범위 - 지역변수, 인스턴스 변수, 클래스 변수
			this.operand1 = operand1;
			this.operator = operator;
			this.operand2 = operand2;

	}
}		