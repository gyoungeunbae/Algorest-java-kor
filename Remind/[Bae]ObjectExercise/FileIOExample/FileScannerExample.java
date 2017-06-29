package FileManager;
import java.io.*;
import java.util.*;
public class FileScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File aFile = new File("C:/Users/PC/Desktop/tempDirectory","inputFile1.txt");
		Scanner scan = new Scanner(aFile);
		int count = 1;
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			System.out.println("["+count+"]  "+line);
			count++;
		}
		}
		catch(FileNotFoundException e) {
			System.out.println("File dont exist.");
		}
	}

}
