package Ch12;
/*
 * 날짜 : 2022/09/13
 * 이름 : 조주영
 * 내용 : 제네릭 메서드 구현하기
 * 
 */
public class P401 {
	public static <T, V> double makeRectangle(P400<T, V> p1, P400<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		P400<Integer, Double> p1 = new P400<Integer, Double>(0, 0.0);
		P400<Integer, Double> p2 = new P400<>(10, 10.0);
		
		double rect = P401.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 "+rect+"입니다.");
	}

}
