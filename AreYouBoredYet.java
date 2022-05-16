// JT Fulkerson Period 3
import java.util.Scanner;
public class AreYouBoredYet {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num = 0;
      boolean flag = false;
      int tick = 0;
      while (!flag) {
         System.out.print("Are you bored yet? [Press 1 for Yes, 0 for No]: ");
         num = input.nextInt();
         if (num == 1) {
         System.out.println ("Finally");
            flag = true;
         }
         if (num == 0) {
                     tick++;
               if (tick == 6){
      System.out.println("I give up.");
      flag = true;
      }
      else{
            System.out.println ("Hmm..");
            }
         }
      }
      }
   }

