package question4_2;

import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		boolean run = true;
		int balance =0;
		Scanner scanner = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("______");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("______");
			System.out.print("선택>");
			
			int num1 = Integer.parseInt(scanner.nextLine());
			switch (num1) {
			case 1:
				System.out.println("예금액> 10000");
				break;
			case 2:
				System.out.println("출금액> 2000");
				break;
			case 3:
				System.out.println("잔고> 8000");
				break;
			case 4:
				System.out.println("\n프로그램 종료");
				if (run == true) {
					run = false;
			}
			
		
		}
	}
	
		}
}

