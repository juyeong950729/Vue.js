package Ch12;
/*
 * 날짜 : 2022/09/20
 * 이름 : 조주영
 * 내용 : TreeSet 활용하기
 *  
 */

import java.util.Iterator;
import java.util.TreeSet;

public class P431 {
	private TreeSet<Member> treeSet;
	
	public P431() {
		treeSet =  new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember (int memberId) {
		Iterator<Member> ir = treeSet.iterator();
		
		while (ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember() {
		for (Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
