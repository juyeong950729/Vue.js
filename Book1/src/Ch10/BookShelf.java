package Ch10;
/*
 * 날짜 : 2022/09/02
 * 이름 : 조주영
 * 내용 : BookShelf 클래스 구현하기
 * 페이지 : 341
 * 
 */
public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}
	

}
