package Ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 날짜 : 2022/09/23
 * 이름 : 조주영
 * 내용 : throws로 예외 미루기
 * 참조 페이지 : 504
 * 
 */
public class P501 {
	
	public Class loadClass (String fileName, String className)
		throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		P501 test = new P501();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
