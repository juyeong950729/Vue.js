package Ch12;
/*
 * 날짜 : 2022/09/20
 * 이름 : 조주영
 * 내용 : HashMap 활용하기
 * 
 */

import java.util.HashMap;
import java.util.Iterator;

public class P440 {
	private HashMap<Integer, Member> hashMap;
	
	public P440() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember (Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}

}
