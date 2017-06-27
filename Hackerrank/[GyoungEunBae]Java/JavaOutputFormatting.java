import java.util.*;
public class JavaOutputFormatting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            int s1Length = s1.length();
            int xLength = x/10;
            int minusLength = 15 - s1Length;
            
            System.out.print(s1);
            
            for(int j = 0; j < minusLength; j++ ) {
                System.out.print(" ");
            }
            
            if(xLength < 10 && xLength > 0) {
                System.out.println("0"+x);
                 
            }
            else if(xLength < 1) {
                System.out.println("00"+x);
            }
            else {
                System.out.println(x);
            }
        }
        System.out.println("================================");
	}

}
