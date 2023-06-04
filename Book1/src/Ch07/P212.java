package Ch07;
/*
 * 날짜 : 2022/08/24
 * 이름 : 조주영
 * 내용 : System.arraycopy()로 배열 복사하기
 * 
 */
public class P212 {
	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		System.arraycopy(array1, 0, array2, 1, 4);
		
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
