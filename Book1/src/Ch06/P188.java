package Ch06;
/*
 * 날짜 : 2022/08/24
 * 이름 : 조주영
 * 내용 : 학번 출력하기
 * 
 */
public class P188 {
	public static void main(String[] args) {
		P187 studentLee = new P187();
		studentLee.setStudentName("이지원");
		System.out.println(P187.getSerialNum());
		System.out.println(studentLee.studentName + "학번 : " + studentLee.studentID);
		
		P187 studentSon = new P187();
		studentSon.setStudentName("손수경");
		System.out.println(P187.getSerialNum());
		System.out.println(studentSon.studentName + "학번 : " + studentSon.studentID);
	}

}
