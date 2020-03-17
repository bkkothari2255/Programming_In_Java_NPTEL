import java.util.Scanner;
interface Number {
    int findSqr(int i);  // Returns the square of n
}

//Create a class A which implements the interface Number.
class A{
  int findSqr(int i){
 	i *=i;
    return i;
  }
  
}
  public class Question5_1{ 
        public static void main (String[] args){ 
	      A a = new A();   //Create an object of class A
           // Read a number from the keyboard
           Scanner sc = new Scanner(System.in);  
           int i = sc.nextInt();
           System.out.print(a.findSqr(i)); 
    } 
}
