package FileManager;
import java.io.*;
import java.util.*;
public class FileManager {
	public static void main(String[] args) {
		try{
			Scanner scan = new Scanner(System.in);
			Book list[] = new Book[50];
			int count = 0;
			String title;
			String ans="y";
	 		
			while(true) {
				
				System.out.println(count+"***");
				System.out.println("제목을 입력하세요");
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
		} catch (Exception e) {
			System.out.println("???");
		}
	}
}
	
