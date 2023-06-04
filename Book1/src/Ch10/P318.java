package Ch10;
/*
 * 날짜 : 2022/09/01
 * 이름 : 조주영
 * 내용 : CompleteCalc 클래스(P317) 실행하기
 * 참조 페이지 : 328, 330
 * 
 */
public class P318 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		P317 calc = new P317();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.time(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		calc.description();
		
		int[] arr = {1, 2, 3, 4, 5
				};
		System.out.println(Calc.total(arr));
		
	}

}
