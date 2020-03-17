import java.util.Scanner;
public class Question94{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// Declaring 5x5 2D char array to store input
		char original[][]= new char[5][5];
		
		// Declaring 5x5 2D char array to store reflection
		char reflection[][]= new char[5][5];
		
		// Input 2D Array using Scanner Class
		for(int line=0;line<5; line++){
			String input = sc.nextLine();
			char seq[] = input.toCharArray();
			if(seq.length==5){
				for(int i=0;i<5;i++){
					original[line][i]=seq[i];
				}
			}
		}
		
		// Performing the reflection operation
		for(int i=0; i<5;i++){
			for(int j=0; j<5;j++){		
				reflection[i][j]=original[i][4-j];
			}
		}
		
		// Output the 2D Reflection Array
		for(int i=0; i<5;i++){
			for(int j=0; j<5;j++){		
				System.out.print(reflection[i][j]);
			}
			System.out.println();
		}
	} // The main() method ends here
} // The main class ends here