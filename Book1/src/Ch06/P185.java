package Ch06;
/*
 * 날짜 : 2022/08/24
 * 이름 : 조주영
 * 내용 : 학번 확인하기
 * 
 */
public class P185 {
	public static void main(String[] args) {
		P184 studentLee = new P184();
		studentLee.setstudentName("이지원");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + "학번: "+studentLee.studentID);

		
		P184 studentSon = new P184();
		studentSon.setstudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + "학번: "+studentSon.studentID);
		
	}

}
