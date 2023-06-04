package Ch12;
/*
 * 날짜 : 2022/09/13
 * 이름 : 조주영
 * 내용 : GenericPrinter<T> 클래스 정의하기
 * 페이지 : 393, 397, 398
 * 
 */
public class GenericPrinter<T extends Material> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting(); 		// P.398에서 추가
	}

}
