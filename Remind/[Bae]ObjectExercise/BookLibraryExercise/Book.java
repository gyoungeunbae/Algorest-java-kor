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
			System.out.println("����Ͻðڽ��ϱ�? (y/n)");
			ans = scan.next();
			if(ans!="y")break;
		}
	}
	public void read(Scanner s) {
	 	Book b = new Book();
		System.out.println("������ �Է��ϼ���");
	 	b.title=s.nextLine();
	 	System.out.println("isbn ���ڰ�, ���ǳ⵵, ���ǻ縦 ���ʷ� ��������...");
	 	b.isbn = s.nextInt();
	 	b.year = s.nextInt();
	 	b.publisher = s.next();
	 	System.out.println("���ڼ��� �ְ��Է��ϼ���");
	 	b.howmanyAuthor = s.nextInt();
	 	int num = b.howmanyAuthor;
	 	for (int i=0;i<num;i++) {
	 		System.out.println("�����̸��� �Է�");
	 		b.author[i] = s.next();
	 	}
	 	
	}
	void print() {
	
	}
	
}
