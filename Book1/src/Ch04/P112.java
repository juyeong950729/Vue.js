package Ch04;
/*
 * 날짜 : 2022/08/23
 * 이름 : 조주영
 * 내용 : do-while문 예제
 * 
 */
public class P112 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		
		do {
			sum += num;
			num ++;
		} while (num <= 10);
		
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
	}

}
