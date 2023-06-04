package Ch06;
/*
 * 날짜 : 2022/08/23
 * 이름 : 조주영
 * 내용 : 지하철 클래스 구현하기
 * 
 */
public class P178 {
	String lineNumber;		// 지하철 노선
	int passengerCount;		// 승객 수
	int money;				// 수입액
	
	public P178(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;	// 수입 증가
		passengerCount++;		// 승객 수 증가
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "의 승객은 " + passengerCount +
				"명이고, 수입은" + money + "입니다.");
	}

}
