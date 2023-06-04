package Ch08;

import java.util.ArrayList;

/*
 * 날짜 : 2022/08/31
 * 이름 : 조주영
 * 내용 : 배열을 활용한 고객 관리 프로그램 구현하기
 * 
 */
public class P268 {
	public static void main(String[] args) {
	
		ArrayList<P234> customerList = new ArrayList<P234>();
		
		P234 customerLee = new P234(10010, "이순신");
		P234 customerShin = new P234(10020, "신사임당");
		P234 customerHong = new P234(10030, "홍길동");
		P234 customerYoul = new P234(10040, "이율곡");
		P234 customerKim = new P237(10050, "김유신", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		
		System.out.println("====== 고객 정보 출력 ======");
		for(P234 customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== 할인율과 보너스 포인트 계산 ======");
		int price = 10000;
		for(P234 customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 "
					+ cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() +
					"님의 현재 보너스 포인트는 "
					+ customer.bonusPoint + "점입니다.");
		}
		
		
	}

}
