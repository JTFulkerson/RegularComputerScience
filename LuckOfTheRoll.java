//Name JT Fulkerson, Benji Borger Period 3
public class LuckOfTheRoll {
   public static void main(String[] args) {
      boolean flag = false;
      int player1 = 0;
      int player2 = 0;
      int rolls = 0;
      System.out.println("Roll   Player 1   Player 2");
   
      while (!flag) {
         rolls++;
         player1 += ((int)(Math.random()*6)+1);
         player2 += ((int)(Math.random()*6)+1);
         System.out.println(" " + rolls + "\t\t\t" + +player1 + "\t\t\t\t" + player2);
         if (player2 > 21 && player1 > 21){
            System.out.println("It's a tie!");
            flag = true;
         }
         else if(player1 == 21 && player2 == 21){
            System.out.println("It's a tie!");
            flag = true;
         }
         else if(player1 == 21){
            System.out.println("Player One Wins!");
            flag = true;
         }
         else if (player2 == 21){
            System.out.println("Player Two Wins!");
            flag = true;
         }
         else if (player1 > 21){
            System.out.println("Player Two Wins!");
            flag = true;
         }
         else if (player2 > 21){
            System.out.println("Player One Wins!");
            flag = true;
         }
      }
   }
}