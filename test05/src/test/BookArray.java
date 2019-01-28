package test;

import java.util.Scanner;

class Book0{
	String title, author;
	public Book0(String title, String author) {
		this.author = author;
		this.title = title;
	}
	void print() {
		System.out.println("("+title+","+author+")");
	}
}
public class BookArray {

	public static void main(String[] args) {
		Book0 b[] = new Book0[2];
		
		Scanner s = new Scanner(System.in);
		for(int i=0; i<b.length; i++) {
			System.out.print("제목>>");
			String title = s.nextLine();
			System.out.print("저자>>");
			String author = s.nextLine();
			b[i] = new Book0(title, author);
		}
		for(int i=0; i<b.length; i++) {
			b[i].print();
		}
	}

}
