import java.util.*;
public class JavaStdinandStdout2 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.skip("[\\r\\n]+");
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}

}
