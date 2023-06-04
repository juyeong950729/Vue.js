package Ch12;
/*
 * 날짜 : 2022/09/21
 * 이름 : 조주영
 * 내용 : TreeMap 활용하기
 * 
 */
public class P444 {
	public static void main(String[] args) {
		P443 memberHashMap = new P443();
		
		Member memberPark = new Member(1003, "박서훤");
		Member memberLee = new Member(1001, "이지원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberSon = new Member(1002, "손민국");
		
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSon);
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		
	}

}
