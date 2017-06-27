import java.util.*;
public class NonSquare {
//step1
	public static void main(String[] args) {
		int index2D=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("행의 수를 입력하세요");
		index2D = scanner.nextInt();
		int intArray[][] = new int[index2D][];
		Random rand = new Random();
		for(int i=0;i<index2D;i++) {
			System.out.println((i+1)+"행의 크기를 입력하세요..");
			
			int index =scanner.nextInt();
			intArray[i]=new int[index];
			
		}
		
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++) {
				int num = rand.nextInt(100);
				intArray[i][j]=num;
			}
			
		}
		for(int i=0;i<intArray.length;i++) {
			System.out.print("["+(i+1)+"]  ");
			for(int j=0;j<intArray[i].length;j++) {
				
				System.out.print("  "+intArray[i][j]);

			}
			System.out.println();
		}
	}

}
