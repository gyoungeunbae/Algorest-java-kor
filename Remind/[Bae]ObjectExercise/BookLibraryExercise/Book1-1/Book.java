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
	Book(String t) 
	{
		title = t;
	}
	public void read(Scanner s) {
		System.out.println("isbn 숫자값, 출판년도, 출판사를 차례로 넣으세요...");
	 	isbn = s.nextInt();
	 	year = s.nextInt();
	 	publisher = s.next();
	 	System.out.println("저자수를 넣고입력하세요");
	 	howmanyAuthor = s.nextInt();
	 	int num = howmanyAuthor;
	 	for (int i=0;i<num;i++) {
	 		System.out.println("저자이름을 입력");
	 		author[i] = s.next();
	 		s.nextLine();
	 	}
	 }
	
	 	
	
	
	
}
