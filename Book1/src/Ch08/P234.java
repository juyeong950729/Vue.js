package Ch08;
/*
 * 날짜 : 2022/08/31
 * 이름 : 조주영
 * 내용 : Customer 클래스 구현하기
 * 참조 페이지 : 238, 241, 245, 262
 * 
 */
public class P234 {
	
	protected int customerID;   	// 고객 아이디, private에서 수정
	protected String customerName;  // 고객 이름 , private에서 수정
	protected String customerGrade; // 고객 등급 , private에서 수정
	int bonusPoint;				    // 보너스 포인트
	double bonusRatio;   		    // 적립 비율
	
	
	public P234() {
		initCustomer();		// P.262에서 추가,수정
		//customerGrade = "SILVER";   // 기본 등급
		//bonusRatio = 0.01;  		// 보너스 포인트 기본 적립 비율
		//System.out.println("Customer() 생성자 호출");  // P.241에서 추가
	}
	
	public P234(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();		// P.262에서 추가,수정
		//customerGrade = "SILVER";
		//bonusRatio = 0.01;
		//System.out.println("Customer(int, String) 생성자 호출");  // P.245에서 추가
	}
	
	private void initCustomer() {	// P.262에서 추가
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;  // 보너스 포인트 계산
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade +
		"이며, 보너스 포인트는 "+ bonusPoint + "입니다.";
		
	}
	
	
	
	// P.238에서 추가
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	

}
