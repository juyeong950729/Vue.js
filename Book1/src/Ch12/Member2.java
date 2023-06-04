package Ch12;

import java.util.Comparator;

/*
 * 날짜 : 2022/09/20
 * 이름 : 조주영
 * 내용 : Comparator 인터페이스 구현하기
 * 페이지 : 436
 * 
 */
public class Member2 implements Comparator<Member2> {
	private int memberId;
	private String memberName;
	
	public Member2 (int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public int compare(Member2 mem1, Member2 mem2) {
		return mem1.getMemberId() - mem2.getMemberId();
	}

}
