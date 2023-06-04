package Ch05;
/*
 * 날짜 : 2022/08/23
 * 이름 : 조주영
 * 내용 : 생성자 테스트하기
 * 페이지 : 153, 158
 * 
 */
public class PersonTest {

	public static void main(String[] args) {
		
		Personal personKim = new Personal();
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;

		Personal personLee = new Personal("이순신", 175, 75);
		
	}
	

	
}
