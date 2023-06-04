package Ch10;
/*
 * 날짜 : 2022/09/01
 * 이름 : 조주영
 * 내용 : 계산기 클래스 만들기
 * 
 */
public class P317 extends P316 {

	@Override
	public int time(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
	  if(num2 != 0)
		return num1/num2;
	  else
		return Calc.ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

}
