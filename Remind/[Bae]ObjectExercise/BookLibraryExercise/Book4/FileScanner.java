package FileIO;
import java.io.*;
import java.util.*;

import FileManager.Book;
public class FileScanner {
		public static void main(String[] args) throws FileNotFoundException {
			int count = 0;
			Book list[] = new Book[100];
			File aFile = new File("C:/Users/PC/Desktop/tempDirectory","inputFile1.txt");
			Scanner scan = new Scanner(aFile);
			Scanner s = new Scanner(System.in);
			while(scan.hasNextLine()) {
				list[count] = new Book();
				list[count].read(scan);
				//list[count].print(count);
				count++;
				}
			while(true) {
			System.out.print("검색할 키워드를 넣으세요");
			String keyword = s.next();
			if(keyword.equals("end")) {
				break;
			}
				for(int i=0;i<count;i++) {
						if(list[i].search(keyword) == true)
						{
							list[i].print(i);
						}
					
					

				}
			}
		}

	}


