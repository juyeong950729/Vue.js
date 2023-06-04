package Ch05;
/*
 * 날짜 : 2022/08/23
 * 이름 : 조주영
 * 내용 : 학생 클래스 만들기
 * 페이지 : 129, 132, 141, 142, 144, 162, 164
 * 
 */
public class Student {
	
	int studentID;					// 학번
	private String studentName;		// 학생 이름
	int grade;						// 학년
	String address;					// 사는 곳
	
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address); // 이름, 주소 출력
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student (); // Student 클래스 생성
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());

	}
	
	public void setStudentName1(String studentName) {
		this.studentName = studentName;
	}

}
