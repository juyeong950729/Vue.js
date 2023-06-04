package Ch09;
/*
 * 날짜 : 2022/09/01
 * 이름 : 조주영
 * 내용 : AdvancedLevel 클래스 구현하기
 * 페이지 : 300
 * 
 */
public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 jump합니다.");
	}

	@Override
	public void turn() {
		System.out.println("Turn할 줄 모르지롱.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 중급자 레벨입니다. *****");
	}

}
