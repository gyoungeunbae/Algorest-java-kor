import java.util.*;
public class Sort {

	void bubbleSort(int data[], int n) {
		
			for(int i=n;i>0;i--) {
				for(int j=0;j<i;j++) {
					System.out.println("** ");
					System.out.println(data[j]+ " "+data[j+1]);
					if(data[j] > data[j+1]) {
						System.out.println(data[j]+ " "+data[j+1]);
						int tmp = data[j];
						data[j] = data[j+1];
						data[j+1] = tmp;
						System.out.println(data[j]+ " "+data[j+1]);
					}
				}
			}
		
		for(int i=0;i<data.length;i++) {
			System.out.print(" "+data[i]+" ");
			
		}
	}
	public static void main(String[] args) {

		int bubbleSort[] = {66,33,99,88,55,22,77};
		new Sort().bubbleSort(bubbleSort, bubbleSort.length-1);
		
	}

}
