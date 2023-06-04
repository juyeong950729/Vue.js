package Ch09;
/*
 * 날짜 : 2022/09/01
 * 이름 : 조주영
 * 내용 : 테스트 프로그램 실행하기
 * 
 */
public class P303 {
	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
	}

}
