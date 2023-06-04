package Ch13;
/*
 * 날짜 : 2022/09/23
 * 이름 : 조주영
 * 내용 : 매개변수로 전달하는 람다식
 * 참조 페이지 : 471
 * 
 */

interface PrintString {
	void showString(String str);
}

public class P470 {
	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello lamda_1");
		showMyString(lambdaStr);
		PrintString reStr = returnString(); 	// 변수로 반환받기
		reStr.showString("hello "); 			// 메서드 호출
	}
	
	public static void showMyString(PrintString p) {
		p.showString("hello lamda_2");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "world");
	}

}
