package Ch06;
/*
 * 날짜 : 2022/08/23
 * 이름 : 조주영
 * 내용 : 학생 클래스 구현하기
 * 
 */
public class P175 {
	public String studentName;		// 학생 이름
	public int grade;				// 학년
	public int money;				// 학생이 가지고 있는 돈
	
	public P175(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(P177 bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(P178 subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
		
	}
 
}
