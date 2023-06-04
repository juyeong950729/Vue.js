package Final;
/*
 * 날짜 : 2022/09/26
 * 이름 : 조주영
 * 내용 : Pass/Fail 학점 클래스 구현
 * 
 */
public class PassFailEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int point) {
		if(point >= 70 && point <= 100)
			return "P";
		else
			return "F";
		
	}

}
