// Interface A is defined with an abstract method run()
interface A {
	public abstract void run();
}

// Class B is defined which implements A and an empty implementation of run()
class B implements A {
	public void run() {}
}
// Create a class named MyThread and extend/implement the required class/interface
class MyThread extends B {
// Define a method in MyThread class to print the output 
	public void run(){
		System.out.print("NPTEL Java");
	}
}	
		// Main class Question is defined
public class Question63 {
     public static void main(String[] args) {
		 // An object of MyThread class is created
         MyThread t = new MyThread();
		 // run() of class MyThread is called
         t.run();
     }
}

