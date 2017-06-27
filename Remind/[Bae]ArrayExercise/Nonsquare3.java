import java.util.Random;
import java.util.Scanner;

public class Nonsquare3 {
	public static void main(String[] args) {
		int index2D=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("행의 수를 입력하세요");
		index2D = scanner.nextInt();
		int totalArray[] = new int[index2D];
		int intArray[][] = makeRandArray(index2D);
		
		totalArray=getTotal(intArray);
		printArray(intArray,totalArray);
		
	}
	 public static int[][] makeRandArray(int row) {
		 int[][]intArray = new int[row][];
		 Scanner scan=new Scanner(System.in);
		 for(int i=0;i<row;i++) {
				System.out.println((i+1)+"행의 크기를 입력하세요..");
				int index =scan.nextInt();
				intArray[i]=new int[index];	
			}
		 
		 for(int i=0;i<intArray.length;i++) {
				for(int j=0;j<intArray[i].length;j++) {
					Random rand = new Random();
					int num = rand.nextInt(100);
					intArray[i][j]=num;
				}
			}
			return intArray;
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
	public static void printArray(int[][]arr,int totalarr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print("["+(i+1)+"]  ");
			for(int j=0;j<arr[i].length;j++) {		
				System.out.print("  "+arr[i][j]);
			}
			System.out.print("  total: "+totalarr[i]);
			System.out.println();
		}
	} 

}
