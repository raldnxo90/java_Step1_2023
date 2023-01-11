package chapter04;

public class Book {
	
	private String bookname;//멤버변수, public-메인에서 사용 가능
	public String author;
	
	//디폴트 생성자
	public Book() {
		
	}
	
	public Book(String bookname, String author) {//가매개변수
		this.bookname=bookname;
		this.author=author;
		
		
	}
	
	//================================================
	public String getBookname() {//getBookname=함수
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	//================================================
	//사용자 정의
	public void showBookinfo() {
		System.out.println("책 이름 : "+bookname+" |저자 : "+author);
	}

}
