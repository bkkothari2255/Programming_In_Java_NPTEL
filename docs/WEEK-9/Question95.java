import java.util.Scanner;
public class Question95{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// Declare the 5X5 2D array to store the input
		char original[][]= new char[5][5];
		
		// Input 2D Array using Scanner Class and check data validity
		for(int line=0;line<5; line++){
			String input = sc.nextLine();
			char seq[] = input.toCharArray();
			if(seq.length==5){
				for(int i=0;i<5;i++){
					if(seq[i]=='0' || seq[i]=='1'){
						original[line][i]=seq[i];
						if(line==4 && i==4)
							flipflop(original);
					}
					else{
						System.out.print("Only 0 and 1 supported.");
						break;
					}
				}
			}else{
				System.out.print("Invalid length");
				break;
			}

		}
	}
	static void flipflop(char[][] flip){
		// Flip-Flop Operation
		for(int i=0; i<5;i++){
			for(int j=0; j<5;j++){		
				if(flip[i][j]=='1')
					flip[i][j]='0';
				else
					flip[i][j]='1';
			}
		}
	
		// Output the 2D FlipFlopped Array
		for(int i=0; i<5;i++){
			for(int j=0; j<5;j++){		
				System.out.print(flip[i][j]);
			}
			System.out.println();
		}
	} // The main() ends here
} // The main class ends here