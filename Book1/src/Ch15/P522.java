package Ch15;

import java.io.FileInputStream;

/*
 * 날짜 : 2022/09/23
 * 이름 : 조주영
 * 내용 : FileInputStream 사용하기
 * 
 */
public class P522 {
	public static void main(String[] args) throws NullPointerException {
		FileInputStream fis = null;
		
		try {
		 fis = new FileInputStream("input.txt");
		 System.out.println(fis.read());
		 System.out.println(fis.read());
		 System.out.println(fis.read());
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		System.out.println("end");
	}

}
