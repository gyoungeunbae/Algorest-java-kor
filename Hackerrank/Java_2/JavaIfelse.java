public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String ans = "Weird";
        if(n%2==0)
            if(1 < n && n < 6 || n > 20)
                ans = "Not Weird";
        System.out.println(ans);
        
    }
}
