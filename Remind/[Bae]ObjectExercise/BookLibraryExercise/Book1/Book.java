package FileManager;

import java.util.Scanner;
import java.io.*;
public class Book {
	Scanner filein = null;
	String title = "";
	int isbn = 0;
	int year = 0;
	String publisher = "";
	int howmanyAuthor = 0;
	String author[]=new String[10];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book list[] = new Book[10];
		String ans = null;
		int count = 0;
		while(true) {
			Book b = new Book();
			b.read(scan);
			count++;
			System.out.println("계속하시겠습니까? (y/n)");
			ans = scan.next();
			if(ans!="y")break;
		}
	}
	public void read(Scanner s) {
	 	Book b = new Book();
		System.out.println("제목을 입력하세요");
	 	b.title=s.nextLine();
	 	System.out.println("isbn 숫자값, 출판년도, 출판사를 차례로 넣으세요...");
	 	b.isbn = s.nextInt();
	 	b.year = s.nextInt();
	 	b.publisher = s.next();
	 	System.out.println("저자수를 넣고입력하세요");
	 	b.howmanyAuthor = s.nextInt();
	 	int num = b.howmanyAuthor;
	 	for (int i=0;i<num;i++) {
	 		System.out.println("저자이름을 입력");
	 		b.author[i] = s.next();
	 	}
	 	
	}
	void print() {
	
	}
	
}
