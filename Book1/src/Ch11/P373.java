package Ch11;
/*
 * 날짜 : 2022/09/08
 * 이름 : 조주영
 * 내용 : StringBuilder 클래스 예제
 * 
 */
public class P373 {
	
	public static void main(String[] args) {
		
		String javaStr = new String("Java");
		System.out.println("javastr 문자열 주소 : " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("연결된 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
	}

}
