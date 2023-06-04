package Ch13;
/*
 * 날짜 : 2022/09/23
 * 이름 : 조주영
 * 내용 : 람다식으로 인터페이스 구현하기
 * 
 */
public class P467 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		concat2.makeString(s1, s2);
	}

}
