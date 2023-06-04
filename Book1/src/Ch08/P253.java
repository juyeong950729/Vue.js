package Ch08;
/*
 * 날짜 : 2022/08/31
 * 이름 : 조주영
 * 내용 : 클래스 형 변환과 재정의 메서드 호출하기
 * 
 */
public class P253 {
	public static void main(String[] args) {
		P234 vc = new P237(10030, "나몰라", 2000);  // VIP 고객 생성
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() +
				"님이 지불해야 하는 금액은 "+vc.calcPrice(10000)
				+ "원입니다.");
	}

}
