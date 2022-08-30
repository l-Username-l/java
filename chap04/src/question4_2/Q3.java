package question4_2;

public class Q3 {

	public static void main(String[] args) {
		System.out.println("주사위를 던집니다.");
		System.out.println("나온 주사위 조합은 다음과 같습니다");
		
		while (true) {
			int num1 = (int)((Math.random()*6)+1);
			int num2 = (int)((Math.random()*6)+1);
			System.out.println("(" + (num1) + ", " + (num2) + ")");
			if (num1 + num2 == 5) {
				System.out.println((num1) + "+" + (num2) + "의 값이 5입니다.");
				break;
			}
			System.out.println((num1) + "+" + (num2) + "의 값이 5가 아닙니다. 다시 굴립니다.");
		
		}

	}

}

