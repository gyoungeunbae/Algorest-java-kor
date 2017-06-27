import java.util.*;
public class Step3 {

	public static void main(String[] args) {
		Random rand = new Random();
		int tmparr[][] = new int[10][10];
		int arr[][] = new int[10][10];
		int count = 0;
		int result = 0;
		//input
		for (int k=0;k<tmparr.length;k++) {
			for (int q=0; q < tmparr[k].length; q++) {
				int num = rand.nextInt(100);
				result = num/10;
				tmparr[result][q]=num;
				}
			}
		
		for (int i=0;i<tmparr.length;i++){
			System.out.print(i*10+"~"+(i*10+9)+" : ");
			for(int j=0;j<tmparr[i].length;j++){
				if(i != 0 && tmparr[i][j]==0) {
					continue;
				}
				System.out.print(tmparr[i][j]+" ");
				count+=1;
			}
			System.out.print("( "+count+" °³)");
			System.out.println();
			count=0;
		}
		}


	}
