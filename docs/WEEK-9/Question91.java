import java.util.Scanner;
public class Question91{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // Read as string, e.g., 5+6
		// Declare and initialize the required variable(s)
		int i=0;
		int j=0;
		double output=0;
		// Split the input string into character array
		char seq[] = input.toCharArray();
		/*
		Use some method to separate the two operands
		and then perform the required operation.
		*/
		for(int a=0; a<seq.length; a++){
			if(seq[a]=='+'){
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,seq.length));
				output = (double)i+j;
			}else if(seq[a]=='-'){
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,seq.length));
				output = (double)i-j;
			}else if(seq[a]=='/'){
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,seq.length));
				output = (double)i/j;
			}else if(seq[a]=='*'){
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,seq.length));
				output = (double)i*j;
			}
		}
		// Print the output as stated in the question
		System.out.print(input+" = " + Math.round(output));
	}
}