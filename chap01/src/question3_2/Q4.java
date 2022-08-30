package question3_2;

public class Q4 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		//학생 1명이 가지는 연필 개수
		int pencilsPerStudents = (pencils/students);
		System.out.println(pencilsPerStudents);
		
		//남은 연필 개수
		int pencilsleft= (pencils%students);
		System.out.println(pencilsleft);

	}

}
