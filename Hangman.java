//Name JT Fulkerson Period 3
import java.util.Scanner;
import java.util.Arrays;

public class Hangman {
   public static void main(String[] args) {
      boolean flag = false;
      int counter = 0;
      Scanner input = new Scanner(System.in);
      String[] Wordchoice = {"DRUM", "BOOK", "BIRD", "YEAR", "TIME", "BELL", "CLAM", "SHIP", "MINE", "FORK"};
      String[] Wordguess = {"_", "_", "_", "_"};
      String[] Word = {"J", "O", "H", "N"};
      int num = (int)(Math.random()*10);
      for(int i=0; i < (4); i++){
      Word[i] = "" + (Wordchoice[num].charAt(i));
      }
      System.out.println("_ _ _ _");
      while(flag == false){
         System.out.println("Guess an uppercase letter: ");
         String Guess = input.next();
         for(int i = 0; i < Word.length; i++){
            if(Guess.equals(Word[i])){
               Wordguess[i] = Guess;
               counter++;
            }
         }
         if(counter==4){
            System.out.println("You win!");
            flag = true;
         }
         if(flag==false){
            for(int j = 0; j < Wordguess.length; j++){
               System.out.print(Wordguess[j] + " ");
            }
            System.out.println();
         }
      }
   }
}