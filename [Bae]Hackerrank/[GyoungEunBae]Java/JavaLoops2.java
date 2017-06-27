import java.util.*;
import java.math.*;
public class JavaLoops2 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        int first = 0;
	        int value = 0;
	        int tmp = 0;
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            first = a;
             for(int j = 0;j <n; j++){
	            tmp = value; 
	            value = first + (int) Math.pow(2, j) * b;
             value += tmp;
             System.out.print(value+" ");
             first =0;    
         }
             value = 0;
             System.out.println();
	        }
        
	        in.close();

	}

}
