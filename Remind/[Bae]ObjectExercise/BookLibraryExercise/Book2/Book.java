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
	String author[];
	Book(String t) 
	{
		title = t;
	}
	boolean search(String keyword) {
		if(title.equals(keyword)) {
			return true;
		}
		else if(Integer.toString(isbn).equals(keyword)) {
			return true;
		}
		else if(Integer.toString(year).equals(keyword)) {
			return true;
		}
		else if(publisher.equals(keyword)) {
			return true;
		}
		for(int i=0;i<author.length;i++) 
			if(author[i].equals(keyword)) 
				return true;
			
		return false;
	}
		
	
	public void read(Scanner s) {
		System.out.println("isbn 숫자값, 출판년도, 출판사를 차례로 넣으세요...");
	 	isbn = s.nextInt();
	 	year = s.nextInt();
	 	publisher = s.next();
	 	System.out.println("저자수를 넣고입력하세요");
	 	howmanyAuthor = s.nextInt();
	 	author = new String[howmanyAuthor];
	 	//int num = howmanyAuthor;
	 	System.out.println("저자들을 입력");
 		
	 	for (int i=0;i<howmanyAuthor;i++) {
	 		author[i] = s.next();
	 		s.nextLine();
	 	}
	 }
	void print() {
		System.out.print("책 제목 : " + title);
		System.out.println("isbn : " + isbn);
		System.out.println("출판년도 : " + year);
		System.out.print("저자 : ");
		for (int i = 0; i < author.length; i++)
			System.out.print(author[i]+" ");
		System.out.println();
	}
	
	 	
	
	
	
}
