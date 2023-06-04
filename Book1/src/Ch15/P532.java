package Ch15;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2022/09/23
 * 이름 : 조주영
 * 내용 : 파일에 바이트 배열로 출력하기
 * 
 */
public class P532 {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output3.txt")){
			byte[] bs = new byte[26];
			byte data = 65;
			for (int i=0; i<bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
