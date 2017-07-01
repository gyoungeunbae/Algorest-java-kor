package StudentPackage;
import java.io.*;
import java.util.*;
public class Student {
	static String id;
	String name;
	String major;
	int grade;
	String phoneNumber;
	String lecture[] = null;
	String tmp;

	Scanner s = null;
	public void read(Scanner s) {
		id = s.next();
		name = s.next();
		major = s.next();
		grade = s.nextInt();
		phoneNumber = s.next();
		tmp = s.next();
		lecture = new String[5];
		int count = 0;
		while(!tmp.equals("0")) {
			lecture[count] = tmp;
			tmp = s.next();
			count++;
		}
}
	void print() {
		int count = 0;
		System.out.println(id);
		System.out.println(name);
		System.out.println(major);
		System.out.println(grade);
		System.out.println(phoneNumber);
		for(int i=0;i<lecture.length;i++) { 
			if(lecture[i]==null) {
				continue;
			}
			System.out.print(lecture[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		
	}
}
