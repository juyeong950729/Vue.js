package Ch15;

import java.io.File;
import java.io.IOException;

/*
 * 날짜 : 2022/09/23
 * 이름 : 조주영
 * 내용 : File 클래스 테스트하기
 * 
 */
public class P557 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\easyspub\\JAVA_LAB\\Chapter15\\newFile.txt");
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete();
	}

}
