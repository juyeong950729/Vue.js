package Final;
/*
 * 날짜 : 2022/09/23
 * 이름 : 조주영
 * 내용 : 과목 클래스 구현
 * 
 */

import java.util.ArrayList;

public class Subject {
	private String subjectName;		// 과목 이름
	private int subjectId;			// 과목 고유 번호
	private int gradeType;			// 학점 평가 정책
	
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = gradeType;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public int getSubjectId() {
		return subjectId;
	}
	
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	public ArrayList<Student> getStudentList( ){
		return studentList;
	}
	
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public int getGradeType() {
		return gradeType;
	}
	
	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	
	public void register(Student student) {
		studentList.add(student);
	}
	
	
}
