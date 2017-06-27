import java.util.*;

public class JavaLoops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int inputDigit = scan.nextInt();
        for(int i=1;i<11;i++) {
            System.out.print(inputDigit+" x "+i+ " = "+(inputDigit*i));
            System.out.println();
        
        }
	}

}
