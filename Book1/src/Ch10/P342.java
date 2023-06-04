package Ch10;
/*
 * 날짜 : 2022/09/02
 * 이름 : 조주영
 * 내용 : BookShelf 테스트하기
 * 
 */
public class P342 {
	
	public static void main(String[] args) {
		
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("태백산맥 1");
		shelfQueue.enQueue("태백산맥 2");
		shelfQueue.enQueue("태백산맥 3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
	}

}
