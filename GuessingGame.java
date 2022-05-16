//Name JT Fulkerson Period 3
import java.util.Scanner;
public class GuessingGame {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number = (int)(Math.random()*1001);
      //System.out.println(number);
      boolean flag = false;
      int guess = (number - 1);
      while (guess != number){
         System.out.print("Guess my number between 1 - 1000:");
         guess = input.nextInt();
         if (guess > number){
            System.out.println("too high");
         }
         else if (guess < number){
            System.out.println("too low");
         }
         else if (guess == number){
            System.out.println("correct");
            flag = true;
         }
      }  
   }
}