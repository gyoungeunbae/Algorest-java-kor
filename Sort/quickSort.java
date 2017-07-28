import java.util.*;
public class Sort {

	void quickSort(int data[],int l, int r) {
			int j=partition(data,l,r);
			partition(data,l,j);
			partition(data,j+1,r);
			for(int i=0;i<data.length;i++) {
				System.out.print(" "+data[i]+" ");
			}
	}
	int partition(int data[],int l, int r) {
		int i=l,pivot=data[i],j=r;
				while(j>i) {
					while(j>i && data[--j]>=pivot) {
						
					}
					if(j>i)data[i]=data[j];
					while(j>i && data[++i]<=pivot) {
						
					}
					if(i<j)data[j]=data[i];
					
				}
				data[j]=pivot;
			return j;
	}
	public static void main(String[] args) {

		int quick[] = {66,33,99,88,44,55,22,77};
		new Sort().quickSort(quick,0,quick.length);
		
	}

}
