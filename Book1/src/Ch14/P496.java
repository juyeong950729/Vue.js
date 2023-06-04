package Ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 날짜 : 2022/09/08
 * 이름 : 조주영
 * 내용 : finally 블록 사용하기
 * 
 */
public class P496 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		} finally {
			if (fis != null) {
			 try {
				 fis.close();
			 } catch (IOException e) {
				 e.printStackTrace();
			 }
			}
			
			System.out.println("항상 수행됩니다.");
		}
		
		System.out.println("여기도 수행됩니다.");
		
	}

}
