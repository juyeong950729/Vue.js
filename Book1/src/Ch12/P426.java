package Ch12;
/*
 * 날짜 : 2022/09/20
 * 이름 : 조주영
 * 내용 : HashSet 활용하기
 *  
 */
public class P426 {
	public static void main(String[] args) {
		P424 memberHashset = new P424();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		
		memberHashset.addMember(memberLee);
		memberHashset.addMember(memberSon);
		memberHashset.addMember(memberPark);
		memberHashset.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동");
		memberHashset.addMember(memberHong);
		memberHashset.showAllMember();
		
	}

}
