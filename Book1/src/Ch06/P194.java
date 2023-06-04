package Ch06;
/*
 * 날짜 : 2022/08/24
 * 이름 : 조주영
 * 내용 : private 생성자 만들기, 인스턴스 생성하기, public 메서드 만들기
 * 
 */
public class P194 {
	private static P194 instance = new P194(); // 유일하게 생성한 인스턴스
	private P194() {}

	public static P194 getInstance() {
		if(instance == null) {
			instance = new P194();
		}
		
		return instance;
	}
}
