import java.io.*;
import java.util.*;

public class Question4{  
    public static void main(String[] args) { 
	  int c=0;
         try{
            InputStreamReader r=new InputStreamReader(System.in);  
            BufferedReader br=new BufferedReader(r);  
            String s1 = br.readLine();
  //Write your code here to count the number of vowels in the string "s1"     
     
s1 = s1.toLowerCase();
for(int i=0;i<s1.length();i++){
char word = s1.charAt(i);
if(word =='a' || word =='e' || word=='i' || word=='o' || word == 'u'){
  c=c+1;
}

}



      System.out.println(c); 
	   }
       catch (Exception e){
		 System.out.println(e);
	    }	   
    }  
}  