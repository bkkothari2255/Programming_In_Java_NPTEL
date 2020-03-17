import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	int n = inr.nextInt();
        int k = 1,sum=0;
        for(int i = 1; i <= n; ++i, k = 1) {
            for(int space = 1; space <= n-i; ++space) {
                System.out.print("  ");
            }
            while(k <= 2 * i - 1) {
                System.out.print(k+" ");
                sum=sum+k;
                ++k;
            }
            System.out.println();
        }
         System.out.println(sum); 
    }
}   