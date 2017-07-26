import java.util.*;
public class Sort {

	void insertionSort(int data[]) {
		
			for(int i=1;i<data.length;i++) {
				int ai = data[i],j=i;
				for(j=i;j>0 && data[j-1]>ai;j--) 
						data[j] = data[j-1];
				data[j] = ai;
			}
		
		for(int i=0;i<data.length;i++) {
			System.out.print(" "+data[i]+" ");
			
		}
	}
	public static void main(String[] args) {

		int bubbleSort[] = {66,33,99,88,44,55,22,77};
		new Sort().insertionSort(bubbleSort);
		
	}

}
