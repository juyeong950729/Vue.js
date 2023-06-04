package Ch06;
/*
 * 날짜 : 2022/08/24
 * 이름 : 조주영
 * 내용 : serialNum의 get(), set() 메서드 사용하기
 * 
 */
public class P187 {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public P187() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		P187.serialNum = serialNum;
	}

}
