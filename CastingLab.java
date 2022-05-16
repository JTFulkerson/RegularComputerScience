//Name: JT Fulkerson   Period: 3
import java.util.Scanner;
public class CastingLab {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a decimal ");
      double decimal = input.nextDouble();
      System.out.print("Enter an from 65 - 90: ");
      int integer = input.nextInt();
      int intdecimal = (int)(decimal);
      char charinteger = (char)(integer);
      System.out.println(decimal + " rounded down is " + intdecimal);
      System.out.println("The letter with the ASCII value " + integer + " is " + charinteger);

   }
}