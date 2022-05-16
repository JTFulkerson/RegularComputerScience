import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your simple addition expression with no spaces: ");
      String expr = input.next();
      System.out.println(add(expr));
      System.out.print("Enter your simple multiplication expression with no spaces: ");
      String multip = input.next();
      System.out.println(multiply(multip));
      System.out.print("Enter your simple division expression with no spaces: ");
      String divi = input.next();
      System.out.println(divide(divi));
   }
   public static int add(String input) {
      int plus = input.indexOf("+");
      int num1a = Integer.parseInt(input.substring(0,plus));
      int num2a = Integer.parseInt(input.substring(plus+1));
      return num1a + num2a;
   }
   public static int multiply(String input) {
      int mult = input.indexOf("*");
      int num1m = Integer.parseInt(input.substring(0,mult));
      int num2m = Integer.parseInt(input.substring(mult+1));
      return num1m * num2m;
   }
   public static double divide(String input) {
      int div = input.indexOf("/");
      int num1d = Integer.parseInt(input.substring(0,div));
      int num2d = Integer.parseInt(input.substring(div+1));
      double num1dd = (double)num1d;
      double num2dd = (double)num2d;
      double equationi = num1d/num2d;
      double equationd = num1dd/num2dd;
      /*if(equationi/equationd==1.0){
      int equation = (int)(equationi);
      }
      else{
      double equation = equationd;
      }
      return equation;
      }*/
      return equationd;
      }
}


