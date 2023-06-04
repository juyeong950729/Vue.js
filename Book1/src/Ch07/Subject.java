package Ch07;
/*
 * 날짜 : 2022/08/30
 * 이름 : 조주영
 * 내용 : Subject 클래스 구현하기
 * 페이지 : 228
 * 
 */
public class Subject {

	private String name;		// 과목 이름
	private int scorePoint;		// 과목 점수
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}
	
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}


}
