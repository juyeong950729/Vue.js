package Ch13;
/*
 * 날짜 : 2022/09/23
 * 이름 : 조주영
 * 내용 : 스트림 활용하기 (1)
 * 
 */
public class P481 {
	private String name;	// 고객 이름
	private int age;		// 나이
	private int price;		// 가격
	
	public P481(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "name: " + name + "age: " + age + "price: " + price;
	}

}
