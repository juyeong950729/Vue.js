package Ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2022/09/23
 * 이름 : 조주영
 * 내용 : 파일 복사하기
 * 
 */
public class P544 {
	public static void main(String[] args) {
		long millisecond = 0;
		try (FileInputStream fis = new FileInputStream("a.zip");
		FileOutputStream fos = new FileOutputStream("cozy.zip")) {
		millisecond = System.currentTimeMillis();
		int i;
		while ((i = fis.read()) != -1) {
			fos.write(i);
		}
		millisecond = System.currentTimeMillis() - millisecond;
	 } catch (IOException e) {
		 e.printStackTrace();
	 }
		System.out.println("파일 복사하는 데 "+millisecond+"milliseconds 소요되었습니다.");
	}

}
