// Interface ShapeX is created
interface ShapeX {
 public String baseX = "This is Shape1";
 public void display1();
}

// Interface ShapeY is created which extends ShapeX
interface ShapeY extends ShapeX {
 public String baseY = "This is Shape2";
 public void display2();
}

// Class ShapeG is created which implements ShapeY
class ShapeG implements ShapeY {
 public String baseG = "This is Shape3";
 //Overriding method in ShapeX interface
 public void display1() {
  System.out.println("Circle: " + baseX);
 }
 // Override method in ShapeY interface
 public void display2() {
  System.out.print("Circle: " + baseY);
 }
}

// Main class Question 
public class Question45{
 public static void main(String[] args) {
  //Object of class shapeG is created and display methods are called.
  ShapeG circle = new ShapeG();
  circle.display1();
  circle.display2();
 }
}