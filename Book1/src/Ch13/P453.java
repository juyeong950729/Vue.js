package Ch13;
/*
 * 날짜 : 2022/09/21
 * 이름 : 조주영
 * 내용 : 정적 내부 클래스 예제
 * 
 */

class OutClass1 {			// 다른 class이기 때문에 임의로 이름 OutClass1로 정함
	private int num = 10;
	private static int sNum = 20;
	
	static class InStaticClass {	// 정적 내부 클래스
		int inNum = 100;			// 정적 내부 클래스의 인스턴스 변수
		static int sInNum = 200;	// 정적 내부 클래스의 정적 변수
	
	void inTest() {
		// num += 10;
		System.out.println("InStaticClass inNum = "+inNum+"(내부 클래스의 인스턴스 변수 사용)");
		System.out.println("InStaticClass sInNum = "+sInNum+"(내부 클래스의 정적 변수 사용)");
		System.out.println("InStaticClass sNum = "+sNum+"(외부 클래스의 정적 변수 사용)");
		
		}
	
		static void sTest() {
		// num += 10;
		// inNum += 10;
		System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 정적 변수 사용)");
		System.out.println("InStaticClass sNum = "+sInNum+"(내부 클래스의 정적 변수 사용)");
		}
	}
}

public class P453 {
	public static void main(String[] args) {
		OutClass1 outClass = new OutClass1();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		OutClass1.InStaticClass sInClass = new OutClass1.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClass1.InStaticClass.sTest();
	}

}
