package Ch08;
/*
 * 날짜 : 2022/08/31
 * 이름 : 조주영
 * 내용 : 하위 클래스 생성하기
 * 
 */
public class P242 {
	public static void main(String[] args) {
		P237 customerKim = new P237();   // 하위 클래스 생성
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
