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
		System.out.println("isbn ���ڰ�, ���ǳ⵵, ���ǻ縦 ���ʷ� ��������...");
	 	isbn = s.nextInt();
	 	year = s.nextInt();
	 	publisher = s.next();
	 	System.out.println("���ڼ��� �ְ��Է��ϼ���");
	 	howmanyAuthor = s.nextInt();
	 	int num = howmanyAuthor;
	 	for (int i=0;i<num;i++) {
	 		System.out.println("�����̸��� �Է�");
	 		author[i] = s.next();
	 		s.nextLine();
	 	}
	 }
	
	 	
	
	
	
}
