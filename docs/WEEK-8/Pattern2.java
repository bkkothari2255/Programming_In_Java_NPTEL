import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	int l = inr.nextInt();
        int i,j;
        int space=l-1;
    /*run loop (parent loop) till number of rows*/
     for(i=0;i< l;i++)
       {
	    /*loop for initially space, before star printing*/
	    for(j=0;j< space;j++)
	    {
		    System.out.print(" ");
	    }
	    for(j=0;j<=i;j++)
	    {
		    System.out.print("* ");
	    }
		
	    System.out.print("\n");
	    space--;	/* decrement one space after one row*/
         }
   	}
}