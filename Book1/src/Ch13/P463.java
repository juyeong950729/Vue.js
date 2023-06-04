package Ch13;
/*
 * 날짜 : 2022/09/23
 * 이름 : 조주영
 * 내용 : 람다식 구현과 호출
 * 
 */
public class P463 {
	public static void main(String[] args) {
		
		MyNumber max = (x, y) -> (x >= y) ? x : y;	// 람다식을 인터페이스형 max 변수에 대입
		System.out.println(max.getMax(10, 20));	 	// 인터페이스형 변수로 메서드 호출
	}

}
