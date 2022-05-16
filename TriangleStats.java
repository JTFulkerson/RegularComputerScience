//Name: JT Fulkerson   Period: 3
import java.util.Scanner;

public class TriangleStats {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter Side 1:");
      int one = input.nextInt();
      System.out.print("Enter Side 2:");
      int two = input.nextInt();
      System.out.print("Enter Side 3:");
      int three = input.nextInt();
      int perimeter = (one + two + three);
      System.out.print("Perimeter: " + perimeter);
      double perimetertwo = (perimeter/2);
      double area = (perimetertwo*(perimetertwo-one)*(perimetertwo-two)*(perimetertwo-three));
      double sqrtarea = (Math.sqrt(area));
      boolean legal = (one + two > three && two + three > one && one + three > two);
      System.out.print("\nLegal triangle: " + (legal));
      if (legal) {
      System.out.print("\nArea: " + (sqrtarea));
      System.out.print("\nEquilateral: " + (one==two && one==three && two==three));
      System.out.print("\nIsosceles: " + (one==two || one==three || two==three));
      System.out.print("\nScalene: " + (one!=two && one!=three && two!=three));
      }
   }
}
