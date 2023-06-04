package Ch13;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2022/09/23
 * 이름 : 조주영
 * 내용 : 스트림 활용하기 (2)
 * 
 */
public class P482 {
	public static void main(String[] args) {
		P481 customerLee = new P481("이순신", 40, 100);
		P481 customerKim = new P481("김유신", 20, 100);
		P481 customerHong = new P481("홍길동", 13, 50);
		List<P481> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 여행 비용은 :"+ total + "입니다");
		
		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		customerList.stream().filter(c -> c.getAge( ) >= 20)
			.map(c -> c.getName( )).sorted().forEach(s -> System.out.println(s));
	}

}
