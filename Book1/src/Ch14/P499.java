package Ch14;
/*
 * 날짜 : 2022/09/23
 * 이름 : 조주영
 * 내용 : try-with-resources문 사용하기 (2)
 * 
 */
public class P499 {
	public static void main(String[] args) {
		try (P498_1 obj = new P498_1()){
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 부분입니다");
		}
	}

}
