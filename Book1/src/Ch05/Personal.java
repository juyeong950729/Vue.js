package Ch05;
/*
 * 날짜 : 2022/08/23
 * 이름 : 조주영
 * 내용 : 생성자 만들기
 * 페이지 : 153, 154, 155, 157
 * 
 * 153page에는 Person class 지만 패키지 내에 중복명이 있기 때문에
 * 임의로 Personal이라는 이름을 사용
 * 
 */
public class Personal {
	String name;
	float height;
	float weight;
	
	public Personal() {}
	
	public Personal(String pname) {
		name = pname;
	}
	
	public Personal(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}

}
