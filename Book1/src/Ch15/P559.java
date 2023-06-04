package Ch15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 날짜 : 2022/09/23
 * 이름 : 조주영
 * 내용 : RandomAccessFile 테스트하기
 * 참조 페이지 : 561
 * 
 */
public class P559 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println("파일 포인터 위치: "+rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("파일 포인터 위치: "+rf.getFilePointer());
		rf.writeUTF("안녕하세요");
		System.out.println("파일 포인터 위치: "+rf.getFilePointer());
		
		rf.seek(0);
		System.out.println("파일 포인터 위치: "+rf.getFilePointer()); 	// P.561에서 추가
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println("파일 포인터 위치: "+rf.getFilePointer());
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
	}

}
