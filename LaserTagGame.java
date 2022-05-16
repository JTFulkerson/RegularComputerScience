import java.util.Scanner;
public class LaserTagGame {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      boolean flag = false;
      int ticker = -1;
      String p1 = "";
      String p2 = "";
      System.out.print("Enter player 1's name: ");
      p1 = input.next();
      System.out.print("Enter player 2's name: ");
      p2 = input.next();
      LaserTagPlayer player1 = new LaserTagPlayer(p1);
      LaserTagPlayer player2 = new LaserTagPlayer(p2);
   //PreGame
      while(!flag){
         if(player1.getShieldStrength() <= 0 || player2.getShieldStrength() <= 0){
            flag = true;
         }
         ticker++;
         if(ticker!=0){
            System.out.println("");
            System.out.println("Round " + ticker);
         }
         //GameCode
         System.out.println(player1.toString());
         System.out.println(player2.toString());
         player1.attemptToTag(player2);
         player2.attemptToTag(player1);
      
      }
      System.out.println("");
      if(player1.isShieldDepleted() == true){
         System.out.println("Winner: " + player2.getName());
      }
      if(player2.isShieldDepleted() == true){
         System.out.println("Winner: " + player1.getName());
      }
   }
}