package kr.brains062;

public class GugudanExample {

	public static void main(String[] args) {
		// 클래스의 생성자를 호출하여 객체를 생성하고, gugudan 참조변수에 할당
		// 참조 변수도 참조하는 클래스와 같은(또는 상위클래스형) 유형
		//Gugudan gugudan = new Gugudan();
		// gugudan.printOne(3);;
		// gugudan.printAll();
		// gugudan.printAll();
		// gugudan.printFrom(7):
		
		SubGugudan subRef = new SubGugudan();
		subRef.printOne(7);
		subRef.printFrom(5);
		subRef.printFrom(5);
	}

}
