package Ch11;
/*
 * 날짜 : 2022/09/08
 * 이름 : 조주영
 * 내용 : Person 클래스 생성하기
 * 페이지 : 379
 * 
 */
public class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name) {
		this.name=name;
	}
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}

}
