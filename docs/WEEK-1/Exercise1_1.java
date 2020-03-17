import java.util.Scanner;  
public class Exercise1_1 {
       public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       double perimeter;
       double area;
//Calculate the perimeter 

	perimeter = 2 * Math.PI * radius;
//Calculate the area
	area = perimeter * radius;
	
	System.out.println(perimeter);
	System.out.println(area);
	}
}