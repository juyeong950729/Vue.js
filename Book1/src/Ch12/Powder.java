package Ch12;
/*
 * 날짜 : 2022/09/13
 * 이름 : 조주영
 * 내용 : Powder 클래스 정의하기
 * 페이지 : 392, 396
 * 
 */
public class Powder extends Material {
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다");
	}
	
	public String toString() {
		return "재료는 Powder입니다";
	}

}
