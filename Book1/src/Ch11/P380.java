package Ch11;
/*
 * 날짜 : 2022/09/08
 * 이름 : 조주영
 * 내용 : Person의 Class 클래스 가져오기
 * 
 */
public class P380 {
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("Ch11.Person");
		System.out.println(pClass3.getName());
		
	}

}
