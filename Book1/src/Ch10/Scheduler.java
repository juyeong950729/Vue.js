package Ch10;
/*
 * 날짜 : 2022/09/01
 * 이름 : 조주영
 * 내용 : Scheduler 인터페이스 정의하기
 * 페이지 : 322
 * 
 */
public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();

}
