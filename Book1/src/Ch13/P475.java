package Ch13;

import java.util.Arrays;

/*
 * 날짜 : 2022/09/23
 * 이름 : 조주영
 * 내용 : 정수 배열에서 스트림 활용하기
 * 
 */
public class P475 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int sumVal = Arrays.stream(arr).sum();
		int count = (int) Arrays.stream(arr).count();
		
		System.out.println(sumVal);
		System.out.println(count);
	}

}
