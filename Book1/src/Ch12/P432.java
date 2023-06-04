package Ch12;
/*
 * 날짜 : 2022/09/20
 * 이름 : 조주영
 * 내용 : TreeSet 활용하기
 *  
 */
public class P432 {
	public static void main(String[] args) {
		P431 memberTreeSet = new P431();
		
		Member memberPark = new Member(1003, "박서훤");
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}

}
