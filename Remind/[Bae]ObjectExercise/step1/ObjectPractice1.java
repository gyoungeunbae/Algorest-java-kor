package objPractice;
import java.util.*;
//회원정보 입력 step1
public class ObjectPractice1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Person list[] = new Person[10];
		Person p = null;
		int count=0;
		String check = "no";
		while(true) {
			p = new Person();
			p.read(scan);
			p.print();
			list[count++] = p;
			System.out.println("CONTINUE???? (Input yes or no)");
			check = scan.next();
			if(!check.equals("yes")) break;
		}
	}
}
