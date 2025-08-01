package oops;
class Book{
	String title;
	String author;
	final int bookId;
	static int BookCounter=1000;
	static final String LibraryName="Central Library";
	
	Book(){
		this.title="Harry Potter";
		this.author="J.K Rowling";
	}
	Book(String title ,String author,final int bookId){
		this.title=title;
		this.author=author;
		
	}
}
	public void displayInfo() {
		System.out.println(title+author+bookId);
	}
	public void displayInfo(String title,String author,final int bookId) {
		System.out.println(title+author+bookId);
	}
	
	
}

public class Mod2 {
	public static void main() {
		Book book=new Book();
		book.displayInfo();
		Book book1=new Book("Harry Potter","J.K Rowling",120);
		book1.displayInfo();
	}
}
