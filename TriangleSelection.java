import java.util.Scanner;
public class TriangleSelection { 
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter Side 1:");
      int side1 = input.nextInt();
      System.out.print("Enter Side 2:");
      int side2 = input.nextInt();
      System.out.print("Enter Side 3:");
      int side3 = input.nextInt();
      System.out.print("Your triangle is " + classifyTriangle(side1,side2,side3)); 
   }

   public static String classifyTriangle(double side1, double side2, double side3) {
      if (side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2){
         return "Not a triangle";
      }
      else if (side1==side2 && side1==side3 && side2==side3){
         return "Equilateral";
      }
      else if (side1==side2 || side1==side3 || side2==side3){
         return "Isosceles";
      }
      else{
         return "Scalene";
      }
   }
}
