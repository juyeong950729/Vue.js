package Ch15;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/23
 * 이름 : 조주영
 * 내용 : Scanner 테스트하기
 * 
 */
public class P518 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름:");
		String name = scanner.nextLine();
		System.out.println("직업:");
		String job = scanner.nextLine();
		System.out.println("사번:");
		int num = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
		
		scanner.close();
	}

}
