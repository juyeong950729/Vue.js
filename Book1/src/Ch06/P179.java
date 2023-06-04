package Ch06;
/*
 * 날짜 : 2022/08/24
 * 이름 : 조주영
 * 내용 : 버스와 지하철 타기
 * 
 */
public class P179 {
	public static void main(String[] args) {
		
		P175 studentJames = new P175 ("James" , 5000);
		P175 studentTomas = new P175 ("Tomas" , 10000);		// 학생 두 명 생성
		
		P177 bus100 = new P177 (100);						// 노선 번호가 100번인 버스 생성
		studentJames.takeBus(bus100);						// james가 100번 버스를 탐
		studentJames.showInfo();							// james 정보 출력
		bus100.showInfo();									// 버스 정보 출력
		
		P178 subwayGreen = new P178("2호선");				// 노선 번호가 2호선인 지하철 생성
		studentTomas.takeSubway(subwayGreen);				// Tomas가 2호선을 탐
		studentTomas.showInfo();							// Tomas 정보 출력
		subwayGreen.showInfo();								// 버스 정보 출력
		
		
	}

}
