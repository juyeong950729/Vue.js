package Ch07;
/*
 * 날짜 : 2022/08/22
 * 이름 : 조주영
 * 내용 : 객체 배열 만들기 (1)
 * 
 */
public class P207 {
	private String bookName;
	private String author;
	
	public P207() {}
	public P207(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	public String getBookNmae() {
		return bookName;
	}
	public void setBookName(String bookName){
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public void showBookInfo() {
		System.out.println(bookName + "," +author);
	}
	
	

}
