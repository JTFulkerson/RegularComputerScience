//Name JT Fulkerson Period 3
import java.util.Scanner;
public class BasicLoops {
   public static void main(String[] args) {
   //A.
      for ( int i=1; i <= 5; i++){
         System.out.println ("Java knows loops.");
      }
      System.out.println ("Java knows when to stop.");
   //B.
      for (int i=1; i<= 8; i++){
         System.out.println ("Flip #" + i + ": Heads");
      }
   //C.
      Scanner input = new Scanner(System.in);
      for (int i=1; i<= 5; i++){
         System.out.print("Enter integer #" + i + ":");
         int user = input.nextInt();
         System.out.println("You entered: " + user);
      }
   //D.
      System.out.print("Enter an integer 0-12: ");
      int integer = input.nextInt();
      for (int i=0; i<= 12; i++){
      int j = integer*i;
         System.out.println (integer + " x " + i + " = " + j);
      }
   }
}  
