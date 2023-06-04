package Ch14;
/*
 * 날짜 : 2022/09/23
 * 이름 : 조주영
 * 내용 : AutoCloseable 인터페이스 구현하기
 * 
 */
public class P498_1 implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close( ) 되었습니다");
	}
	

}
