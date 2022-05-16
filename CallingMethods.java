//Name: JT Fulkerson   Period: 3
import java.util.Scanner;
public class CallingMethods {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int int_a = input.nextInt();
      System.out.print("Enter an integer: ");
      int int_b = input.nextInt();
      System.out.print("Enter a double: ");
      double double_a = input.nextDouble();
      System.out.print("Enter a double: ");
      double double_b = input.nextDouble();
      System.out.print("Enter a double: ");
      double double_c = input.nextDouble();
      System.out.print("Enter a double: ");
      double double_d = input.nextDouble();
      System.out.print("Enter a boolean: ");
      boolean boolean_a  = input.nextBoolean();
      System.out.print("Enter a boolean: ");
      boolean boolean_b  = input.nextBoolean();
      int doubleItResult = doubleIt(int_a);
      System.out.println("doubleIt(" + int_a + ") = " + doubleItResult);
      int sumResult = sum(int_a,  int_b);
      System.out.println("sum(" + int_a + "," + int_b + ") = " + sumResult);
      int sumUpResult = sumUp(int_a);
      System.out.println("sumUp(" + int_a + ") = " + sumUpResult);
      int polygonResult = polygon(int_b);
      System.out.println("polygon(" + int_b + ") = " + polygonResult);
      double discriminantResult = discriminant(double_a, double_b, double_c);
      System.out.println("discriminant(" + double_a + "," + double_b + "," + double_c + ") = " + discriminantResult);
      double slopeResult = slope(double_a, double_b, double_c, double_d);
      System.out.println("slope(" + double_a + "," + double_b + "," + double_c + "," + double_d + ") = " + slopeResult);
      double rectangleAreaResult = rectangleArea(double_a, double_b);
      System.out.println("rectangleArea(" + double_a + "," + double_b + ") = " + rectangleAreaResult);
      double rectanglePerimeterResult = rectanglePerimeter(double_a, double_b);
      System.out.println("rectanglePerimeter(" + double_a + "," + double_b + ") = " + rectanglePerimeterResult);
      boolean bothTrueResult = bothTrue(boolean_a, boolean_b);
      System.out.println("bothTrue(" + double_a + "," + double_b + ") = " + bothTrueResult);
      boolean isEvenResult = isEven(int_a);
      System.out.println("isEven(" + int_a + ") = " + isEvenResult);
boolean or35Result = or35(int_a);
      System.out.println("or35(" + int_a + ") = " + or35Result);
   boolean old35Result = old35(int_a);
      System.out.println("old35(" + int_b + ") = " + old35Result);
   
   }

   public static int doubleIt(int int_a) {
      return int_a * 2;
   }

   public static int sum(int int_a, int int_b) {
      return int_a + int_b;
   }

   public static int sumUp(int int_a) {
      return int_a*(int_a+1)/2;
   }

   public static int polygon(int int_b) {
      return 180*(int_b-2);
   }

   public static double discriminant(double double_a, double double_b, double double_c) {
      return double_b*double_b-4*double_a*double_c;
   }

   public static double slope(double double_a, double double_b, double double_c, double double_d) {
      return (double_d-double_b)/(double_c-double_a);
   }

   public static double rectangleArea(double double_a, double double_b) {
      return double_a * double_b;
   }

   public static double rectanglePerimeter(double double_a, double double_b) {
      return 2*double_a + 2*double_b;
   }

   public static boolean bothTrue(boolean boolean_a, boolean boolean_b) {
      return boolean_a && boolean_b;
   }

   public static boolean isEven(int int_a) {
      return int_a % 2 == 0;
   }

   public static boolean or35(int int_a) {
      return int_a % 3 == 0 || int_a % 5 ==0;
   }

   public static boolean old35(int int_b) {
      return int_b % 3 == 0 ^ int_b % 5 ==0;
   }

}