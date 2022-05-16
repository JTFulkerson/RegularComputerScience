//Name: JT Fulkerson Period: 3
import java.util.Scanner;
public class GuessMyNumber {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Guess my number: ");
      int guess = input.nextInt();
      int mynumber=28;
      if (guess==mynumber){
         System.out.println("You win!");
      }
      else{
         System.out.println("It wasn't " + guess + ", it was " + mynumber + ".");
      }
   }
}