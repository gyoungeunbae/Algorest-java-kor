import java.util.*;
public class ex1 {

	public static void main(String[] args) {
		Random rand = new Random();

		int arr[] = new int[100];
		for (int i=0;i<arr.length;i++) {
			int num = rand.nextInt(100);
			arr[i] = num;
			System.out.print(arr[i]+" ");
			if(i%10 == 9) {
				System.out.println();
			}
		}
	}
}