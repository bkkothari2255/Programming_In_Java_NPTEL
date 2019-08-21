import java.util.Scanner; //This package for reading input
public class Fibonacci { 
    
    public static void main(String args[]) { 
	 Scanner sc = new Scanner(System.in);
	 int n=sc.nextInt(); //Read an integer
        System.out.println(fib(n)); //Generate and print the n-th Fibonacci                
                                     //number
    } 
 static int fib(int n) {
//complete the code segment to find the nth Fibonacci number in the Fibonacci sequence and return the value. Write the function recursively.
		int j=n-1;
		if( j == 0 )
		{
			return 0;
		}
		else if( j == 1 )
		{ 
			return 1;
 		}
		else 
		{
			return (fib(n-2)+fib(n-1));
		}
	}
}