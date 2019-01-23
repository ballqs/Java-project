package test;

class Book2{
	String title;
	String author;
	int ISBN;
	public Book2(String title, String author, int ISNB) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		System.out.println(title);
		System.out.println(author);
		System.out.println(ISBN);
	}
}

public class Book {
	
	public static void main(String[] args) {
		Book2 javaBook = new Book2("Java JDK","х╡╠Беб",3333);
	}

}
