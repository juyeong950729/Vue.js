package Ch11;
/*
 * 날짜 : 2022/09/08
 * 이름 : 조주영
 * 내용 : Person 클래스의 인스턴스 생성하기
 * 
 */
public class P383 {
	public static void main(String[] args) throws ClassNotFoundException,
	InstantiationException, IllegalAccessException {
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("Ch11.Person");
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
	}

}
