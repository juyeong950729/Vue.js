package Ch12;

import java.util.ArrayList;

/*
 * 날짜 : 2022/09/13
 * 이름 : 조주영
 * 내용 : ArrayList 활용하기
 * 참조 페이지 : 411
 * 
 */
public class P410 {
	private ArrayList<Member> arrayList;
	
	public P410() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for (int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);	// get() 메서드로 회원을 순차적으로 가져옴
			int tempId = member.getMemberId();
			if (tempId == memberId) {			// 회원 아이디가 매개변수와 일치하면
				arrayList.remove(i);			// 해당 회원을 삭제
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		P410 memberArrayList = new P410();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
		
		
		
		
	}

}
