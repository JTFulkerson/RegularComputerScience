//Name JT Fulkerson Period 3
import java.util.*; 

public class VotingMachine {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String votes[] = new String [1000];
      int tick = 0;
      boolean flag = false;
      int tomvote = 0;
      int jerryvote = 0;
      int invalid = -1;
      int total = 0;
      while(!flag){
         System.out.print("Enter vote: ");
         votes[tick] = input.next();
         if(votes[tick].equalsIgnoreCase("tom")){
            tomvote++;
         }
         else if (votes[tick].equalsIgnoreCase("jerry")){
            jerryvote++;
         }
         else{
            invalid++;
         }
         if (votes[tick].equalsIgnoreCase("done")){
            flag=true;
         }
         tick++;
      }
      total = tomvote+jerryvote+invalid;
      System.out.println("Total voters: " + total);
      System.out.print("Invalid: " + invalid + " ");
      System.out.println("(" + (double)(invalid*100)/total + "%)");
      System.out.print("Tom: " + tomvote + " ");
      System.out.println("(" + (double)(tomvote*100)/(total-invalid) + "%)");
      System.out.print("Jerry: " + jerryvote + " ");
      System.out.println("(" + (double)(jerryvote*100)/(total-invalid) + "%)");
      if(tomvote>jerryvote && tomvote-jerryvote>1){
         System.out.println("Tom won by " + (tomvote-jerryvote) + " votes");
      }
      else if(tomvote>jerryvote){
         System.out.println("Tom won by " + (tomvote-jerryvote) + " vote");
      }
      if(tomvote<jerryvote && jerryvote-tomvote>1){
         System.out.println("Jerry won by " + (jerryvote-tomvote) + " votes");
      }
      else if(tomvote<jerryvote){
         System.out.println("Jerry won by " + (jerryvote-tomvote) + " vote");
      }
      if(tomvote==jerryvote){
         System.out.println("It's a tie");
      }
   }
}
