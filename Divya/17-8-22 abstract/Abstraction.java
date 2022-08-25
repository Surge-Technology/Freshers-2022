public class Abstraction { 
     public static void main (String args[]) {
         // Shape object referring to circle.
         Shape Circle = new Circle(10);
         circle.draw(); 
         System.out.println("Area of given circle = "+circle.getArea());
         // Shape object referring to rectangle.
         Shape rect = new Rectangle(10,10);
         rect.draw(); 
         System.out.println("Area of given rectangle = "+rect.getArea());
     }
 }