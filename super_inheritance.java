class Book{
	String title;
	String author;
	double price;
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displayDetails(){
		System.out.println("title:"+title);
		System.out.println("author:"+author);
		System.out.println("price:"+price);
	}
}
class EBook extends Book{
	double fileSizeMB;
	EBook(String title,String author,double price,double fileSizeMB){
		super(title,author,price);
		this.fileSizeMB=fileSizeMB;
	}
	public void displayDetails(){
		/*System.out.println("title:"+title);
		System.out.println("author:"+author);
		System.out.println("price:"+price);*/
		super.displayDetails();
		System.out.println("filesizeinMB:"+fileSizeMB+"\n");
	}
}
class PrintedBook extends Book{
	int numberOfPages;
	PrintedBook(String title,String author,double price,int numberOfPages ){
		super(title,author,price);
		this.numberOfPages=numberOfPages;
	}
	public void displayDetails(){
		/*System.out.println("title:"+title);
		System.out.println("author:"+author);
		System.out.println("price:"+price);*/
		super.displayDetails();
		System.out.println("numberOfPages:"+numberOfPages);
}
}
public class Demo1 {
	public static void main(String[] args) {
		//Book book3=new Book("Harry Potter","J.K Rowling",1300);
		//book3.displayDetails();
		EBook book1=new EBook("Harry Potter","J.K Rowling",1300,500.32);
		book1.displayDetails();
		PrintedBook book2=new PrintedBook("Harry Potter","J.K Rowling",300.00,1200);
		book2.displayDetails();
	}
}
