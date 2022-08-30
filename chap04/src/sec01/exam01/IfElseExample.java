package sec01.exam01;
import java.util.Scanner;
public class IfElseExample {

	public static void main(String[] args) {
		
		System.out.print("성적을 입력하세요 :");
		Scanner scanner = new Scanner(System.in);
		String strScore = scanner.nextLine();
		int score = Integer.parseInt(strScore);
		
		if (score >= 90){
			System.out.println("90점 이상입니다.");
			System.out.println("A등급입니다.");
		}
		
		if ((score < 90) & (score >= 80)) {
			System.out.println("80점 이상입니다.");
			System.out.println("A등급입니다.");
		}
		}
	}


