package Ch05;
/*
 * 날짜 : 2022/08/23
 * 이름 : 조주영
 * 내용 : private 변수 테스트하기
 * 페이지 : 163
 * 
 */
public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		
		//studentLee.studentName = "이상원";
		studentLee.setStudentName1("이상원");
		
		System.out.println(studentLee.getStudentName());
		
	}

}
