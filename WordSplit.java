//Name JT Fulkerson Period 3
import java.util.Scanner;
public class WordSplit {
   public static void printLetters(String word) {
      for (int i=0; i< word.length(); i++){
         if(i != (word.length()-1)){
            System.out.print (word.charAt(i) + ", ");
         }
         else{
            System.out.print (word.charAt(i));
         }
      }
   }
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a word: ");
      printLetters(input.next());
   }  

}