package Ch08;
/*
 * 날짜 : 2022/08/31
 * 이름 : 조주영
 * 내용 : 메서드 호출하기
 * 
 */
public class P254 {
	int num;
	
	void aaa() {
		System.out.println("aaa() 출력");
	}
	
	public static void main(String[] args) {
		P254 a1 = new P254();
		a1.aaa();
		P254 a2 = new P254();
		a2.aaa();
	}

}
