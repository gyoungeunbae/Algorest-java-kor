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
			while(true) {
				System.out.println("검색할 키워드를 넣으세요...(종료를 원하면 end 입력)");
				String keyword = scan.next();
				scan.nextLine();
				if(keyword.equals("end")) {
					System.out.println("종료");
					break;
				}
				for(int i=0;i<count;i++) {
					boolean torf = list[i].search(keyword);
					if(torf == true) {
						list[i].print();
						break;
					}
					else {
						System.out.println("입력하신 키워드를 찾을 수 없습니다.");
					}
				}
				
			}
			
		
	}
}
	
