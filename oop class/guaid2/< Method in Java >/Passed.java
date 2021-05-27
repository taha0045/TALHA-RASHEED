public class Passed {
 public static void main(String[] args) {
 TestPass tp = new TestPass(50, 100);
 int number1 = 10;
 int number2 = 20;
 // Before pass by value
 System.out.println("Before pass by value");
 System.out.println("Number1: " + number1);
 System.out.println("Number2: " + number2);
 System.out.println();
 tp.calculate(number1, number2);
 // After pass by value
 System.out.println("After pass by value");
 System.out.println("Number1: " + number1);
 System.out.println("Number2: " + number2);
 System.out.println();
 // Before pass by reference
 System.out.println("Before pass by reference");
 System.out.println("Number1: " + tp.number1);
 System.out.println("Number2: " + tp.number2);
   System.out.println();
 tp.calculate(tp);
 // After pass by reference
 System.out.println("After pass by reference");
 System.out.println("Number1: " + tp.number1);
 System.out.println("Number2: " + tp.number2);
 }
}
