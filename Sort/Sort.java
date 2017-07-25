import java.util.*;
public class Sort {

	void bubbleSort(int data[], int n) {
		for(int i=n-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(data[j] > data[j+1]) {
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1]=tmp;
				}
			}
		}
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
			
		}
	}
	public static void main(String[] args) {

		int bubbleSort[] = {88,55,22,77,11};
		new Sort().bubbleSort(bubbleSort, 5);
		
	}

}
