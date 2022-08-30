package kr.brains.interf;

// java 클래스 단일 상속 - <서브클래스> extends <수퍼클래스>
// 인터페이스 다중 상속 - <서브인터페이스> extends <수퍼인터페이스>[, <수퍼인터페이스>] 다수
// 인터페이스 다중 구현 - <클래스> implements <인터페이스>, ...] 다수
// 다중 구현
public class SmartPhone implements Massenger, Phone, Timer {
	private String phoneNumber;
	
	@Override
	public void playbeep() {
		System.out.println("알람 : 비프음 재생.");

	}

	@Override
	public void playMusic(String title) {
		System.out.printf("알람 : %s 음악 재생.", title);
	}

	@Override
	public void call(String phoneNumber) {
		System.out.println(phoneNumber + "에 전화를 겁니다.");

	}

	@Override
	public void receive() {
		System.out.println("전화를 받습니다.");

	}

	@Override
	public void sendMassage(String phoneNumber, String msg) {
		System.out.printf("[%s]로 %s메세지 전송 \n", phoneNumber, msg);

	}

	@Override
	public void receiveMsg() {
		System.out.println("");
	}

}


