package Ch05;
/*
 * 날짜 : 2022/08/23
 * 이름 : 조주영
 * 내용 : 참조 값 출력하기
 * 
 */
public class P150 {
	public static void main(String[] args) {
		
		Student student1 = new Student();
		//student1.studentName = "안연수";
		Student student2 = new Student();
		//student2.studentName = "안승연";
		
		System.out.println(student1);
		System.out.println(student2);
	}

}
