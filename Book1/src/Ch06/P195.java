package Ch06;
/*
 * 날짜 : 2022/08/24
 * 이름 : 조주영
 * 내용 : 변수의 주소 값 비교하기
 * 
 */
public class P195 {
	public static void main(String[] args) {
		
		P194 myCompany1 = P194.getInstance();
		P194 myCompany2 = P194.getInstance();
		System.out.println(myCompany1 == myCompany2);
		
	}

}
