import java.util.Random;

public class Step4 {
	public static void main(String[] args) {
		Random rand = new Random();
		int tmparr[][] = new int[10][10];
		int arr[][] = new int[10][10];
		int count = 0;
		int result = 0;
		double average = 0.0;
		int sum = 0;
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
				sum+=tmparr[i][j];
				average=sum/count;
			}
			
			System.out.print("( "+count+"°³"+", "+average+" )");
			System.out.println();
			count=0;
			average=0;
			sum=0;
		}
		}

}
