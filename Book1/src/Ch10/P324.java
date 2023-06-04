package Ch10;
/*
 * 날짜 : 2022/09/01
 * 이름 : 조주영
 * 내용 : 우선순위에 따라 배분하기
 * 
 */

// 고객 등급이 높은 고객의 전화부터 대기열에서 가져와 업무 능력이 높은 상담원 우선 배분
public class P324 implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill 값이 높은 상담원에게 우선적으로 배분합니다");
	}
	

}
