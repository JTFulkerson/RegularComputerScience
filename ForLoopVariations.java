//Name JT Fulkerson Period 3
import java.util.Scanner;
public class ForLoopVariations {
   public static void main(String[] args) {
   /*
   //A.
      System.out.println("A.");
      for ( int i=10; i >= 0; i--){
         if (i==0){
            System.out.println("You did it!");
         }
         else{
            System.out.println ("You have " + i + " more pushups to go!");
         }
      }
   //B.
      System.out.println("B.");
      Scanner input = new Scanner(System.in);
      System.out.println("You are playing hangman!");
      for (int i=6; i>= 0; i--){
         if(i==0){
            System.out.println("You lost!");
         }
         else{
            System.out.println("You have " + i + " guesses remaining.");
            System.out.print("Enter your guess: ");
            String user = input.next();
            System.out.println("Sorry, that's not correct!");
         }
      }
   //C.
      System.out.println("C.");
      System.out.print("Enter a positive integer: ");
      int user = input.nextInt();
      for (int i=1; i<= user; i++){
         System.out.println("Hello!");
      }
      */
   //D.
      double fraction;
      int fractionValue;
      int decimal;
      double value;
      System.out.println("D.");
      for (int i=2; i<= 14; i+=2){
         fraction = (double) 1/i;
         fractionValue = (int) (fraction * 10);
         decimal = fractionValue % 10;
         value = decimal * 0.1;
         System.out.println("1/" + i + " = " + value);
      }
      
   }
}  
