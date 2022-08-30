package thebrains.pim.service;

import thebrains.pim.model.Member;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberFileReader<T> {
	Scanner sc = null;
	
	public MemberFileReader(File f) throws FileNotFoundException {
		sc = new Scanner(f);
	}
	public List<T> readMember() {
		List<T> memberList = new ArrayList<T>();
		while(sc.hasNext()) { // 한 라인씩
			Member m = new Member();
			String strArr[] = sc.nextLine().split("\t"); // 각 라인을 tab 기호를 구분자로 사용하여 6개의 요소로 구분
			m.setId(Integer.parseInt(strArr[0]));
			m.setEmail(strArr[1]);
			m.setPw(strArr[2]);
			m.setName(strArr[3]);
			m.setPhone(strArr[4]);
			m.setAddress(strArr[5]);
			memberList.add((T) m);
		}
		return memberList;
	}
}
