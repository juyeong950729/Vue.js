package Ch12;

import java.util.TreeSet;

/*
 * 날짜 : 2022/09/20
 * 이름 : 조주영
 * 내용 : TreeSet 테스트하기
 * 
 */
public class P428 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for (String str : treeSet) {
			System.out.println(str);
		}
	}

}
