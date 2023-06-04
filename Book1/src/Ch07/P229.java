package Ch07;
/*
 * 날짜 : 2022/08/30
 * 이름 : 조주영
 * 내용 : 학생 성적 출력하기
 * 
 */
public class P229 {
	public static void main(String[] args) {
		P227 studentLee = new P227 (1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		P227 studentKim = new P227 (1002, "Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("==============================");
		studentKim.showStudentInfo();
	}

}
