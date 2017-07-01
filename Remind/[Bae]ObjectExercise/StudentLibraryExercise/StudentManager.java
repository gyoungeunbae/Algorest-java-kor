package StudentPackage;

import java.io.*;
import java.util.*;
public class StudentManager {

	public static void main(String[] args) throws FileNotFoundException {
		File aFile = new File("C:/Users/PC/Desktop/tempDirectory","students.txt");
		Scanner s = new Scanner(aFile);
		Student[] student = new Student[50];
		int count = 0;
		while(s.hasNextLine()) {
			student[count] = new Student();
			student[count].read(s);
			student[count].print();
			count++;
		}
		
	}

}
