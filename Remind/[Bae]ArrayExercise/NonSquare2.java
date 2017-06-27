import java.util.Random;
import java.util.Scanner;
//step2
public class NonSquare2 {
	public static void main(String[] args) {
		int index2D=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("행의 수를 입력하세요");
		index2D = scanner.nextInt();
		int totalArr[] = new int[index2D];
		int intArray[][] = new int[index2D][];
		
		for(int i=0;i<index2D;i++) {
			System.out.println((i+1)+"행의 크기를 입력하세요..");
			int index =scanner.nextInt();
			intArray[i]=new int[index];	
		}
		makeRandArray(intArray);
		totalArr=getTotal(intArray);
		
		for(int i=0;i<intArray.length;i++) {
			System.out.print("["+(i+1)+"]  ");
			for(int j=0;j<intArray[i].length;j++) {		
				System.out.print("  "+intArray[i][j]);
			}
			System.out.print("  total: "+totalArr[i]);
			System.out.println();
		}
	}
	 public static void makeRandArray(int[][]intArray) {
		 for(int i=0;i<intArray.length;i++) {
				for(int j=0;j<intArray[i].length;j++) {
					Random rand = new Random();
					int num = rand.nextInt(100);
					intArray[i][j]=num;
				}
			}
			
	 }
	 public static int[] getTotal(int[][] array) {
		int[] tmpArr = new int[array.length]; 
		for(int i=0;i<array.length;i++) {
			int sum=0;
			for(int j=0;j<array[i].length;j++) {
				sum += array[i][j];
			}
			tmpArr[i]=sum;
		}
		return tmpArr;
	}
	 
}
