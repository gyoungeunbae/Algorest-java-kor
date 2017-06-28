package objPractice;
import java.util.*;
public class Person {
	String name;
	int age;
	String gender;
	public void read(Scanner scan) {
		System.out.println("이름 나이 성별을  차례로 입력하세요 !!!");
		name = scan.next();
		age = scan.nextInt();
		gender = scan.next();
	}
	public void print() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("gender: "+gender);
		System.out.println();
		
	}
}
