package FileIO;
import java.io.*;
import java.util.*;

import FileManager.Book;
public class FileScanner {
		public static void main(String[] args) throws FileNotFoundException {
			int count = 1;
			Book list[] = new Book[100];
			File aFile = new File("C:/Users/PC/Desktop/tempDirectory","inputFile1.txt");
			Scanner scan = new Scanner(aFile);
			
			while(scan.hasNextLine()) {
				list[count] = new Book();
				list[count].read(scan);
				list[count].print(count);
				count++;
				}
		}

	}


