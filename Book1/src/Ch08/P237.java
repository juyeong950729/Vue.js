package Ch08;
/*
 * 날짜 : 2022/08/31
 * 이름 : 조주영
 * 내용 : VIPCustomer 클래스 구현하기
 * 참조 페이지 : 242, 245, 250, 263
 * 
 */
public class P237 extends P234 {
	private int agentID;	// VIP 고객 상담원 아이디
	double saleRatio;		// 할인율
	
	public P237() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");	// P.242에서 추가
	}
	
	public P237(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCustomer(int, String) 생성자 호출");  // P.245에서 추가
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override		// P.250에서 추가
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;	// 보너스 포인트 적립
		return price - (int)(price * saleRatio); // 할인된 가격을 계산하여 반환
	}
	
	public String showCustomerInfo() {		// P.263에서 추가
		return super.showCustomerInfo() + "담당 상담원 번호는 "
				+agentID+"입니다";
	}
	

}
