package Ch06;
/*
 * 날짜 : 2022/08/24
 * 이름 : 조주영
 * 내용 : 학번 자동으로 부여하기
 * 
 */
public class P184 {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public P184() {
		serialNum++;				// 학생이 생성될 때마다 증가
		studentID = serialNum;		// 증가된 값을 학번 인스턴스 변수에 부여
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setstudentName(String name) {
		studentName = name;
	}
	
	

}
