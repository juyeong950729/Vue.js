package Ch11;
/*
 * 날짜 : 2022/09/05
 * 이름 : 조주영
 * 내용 : Object 클래스의 toString() 메서드 사용하기
 * 참조 페이지 : 356
 * 
 */

class Book {
	int bookNumber;
	String bookTitle;

Book (int bookNumber, String bookTitle){
	this.bookNumber = bookNumber;
	this.bookTitle = bookTitle;
  }

@Override
public String toString() {
	return bookTitle + "," + bookNumber;
  }

}

public class P354 {
	public static void main(String[] args) {
		
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}

}
