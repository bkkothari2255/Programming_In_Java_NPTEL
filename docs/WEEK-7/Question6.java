import java.io.*;
public class Question6{
	public static void main(String[] args) {
		try ( RandomAccessFile rf =new RandomAccessFile("Text.txt","r"); ) {
		int i= rf.readInt();
		}
		catch(FileNotFoundException ex) {
			System.out.println("File not found");
}
catch(IOException ex) {
ex.printStackTrace();
}
}
}