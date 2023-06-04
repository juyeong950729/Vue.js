package Ch08;
/*
 * 날짜 : 2022/08/31
 * 이름 : 조주영
 * 내용 : calcPrice() 테스트하기
 * 
 */
public class P252 {
	public static void main(String[] args) {
		P234 customerLee = new P234(10010, "이순신");
		customerLee.bonusPoint = 1000;
		
		P237 customerKim = new P237(10020, "김유신", 12345);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() +
				"님이 지불해야 하는 금액은 "+customerLee.calcPrice(price)
				+"원입니다.");
		System.out.println(customerKim.getCustomerName() +
				"님이 지불해야 하는 금액은 "+customerKim.calcPrice(price)
				+"원입니다.");
	}

}
