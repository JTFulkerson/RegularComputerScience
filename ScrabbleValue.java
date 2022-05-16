//Name JT Fulkerson Period 3
import java.util.Scanner;
import java.util.Arrays;
public class ScrabbleValue {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int letter = 0;
      System.out.print("Enter a capital letter: ");
      letter = input.next().charAt(0);
      int[] points = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
      int output = points[letter];
      if(output == 1){
         System.out.println("You recieved " + output + " point!");
      }
      else{
         System.out.println("You recieved " + output + " points!");
      }
   }
}