package FileManager;
import java.io.*;
import java.util.*;
public class FileManager {
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			Book list[] = new Book[50];
			int count = 0;
			String title;
			String ans="y";
	 		
			while(true) {
				System.out.println(count+"***");
				System.out.println("������ �Է��ϼ���");
				title=scan.next();
				scan.nextLine();
				if(title.equals("end")) 
					break;
				list[count] = new Book(title);
		 		list[count].read(scan);
		 		count++;
		 		System.out.println("continue?(y/n)");
		 		ans = scan.next();
		 		
		 		if(ans.equals("n")) 
					break;
		}
			while(true) {
				System.out.println("�˻��� Ű���带 ��������...(���Ḧ ���ϸ� end �Է�)");
				String keyword = scan.next();
				scan.nextLine();
				if(keyword.equals("end")) {
					System.out.println("����");
					break;
				}
				for(int i=0;i<count;i++) {
					boolean torf = list[i].search(keyword);
					if(torf == true) {
						list[i].print();
						break;
					}
					else {
						System.out.println("�Է��Ͻ� Ű���带 ã�� �� �����ϴ�.");
					}
				}
				
			}
			
		
	}
}
	
