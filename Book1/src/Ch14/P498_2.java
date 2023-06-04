package Ch14;
/*
 * 날짜 : 2022/09/23
 * 이름 : 조주영
 * 내용 : try-with-resources문 사용하기 (1)
 * 
 */
public class P498_2 {
	public static void main(String[] args) {
		try(P498_1 obj = new P498_1( )){
		} catch(Exception e) {
			System.out.println("예외 부분입니다");
		}
	}

}
