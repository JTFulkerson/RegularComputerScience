//Name JT Fulkerson Period 3
import java.util.Scanner;
public class RockPaperScissors {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Playing Rock, Paper, Scissors");
      
      boolean flag=false;
      boolean twoflag=false;
      int num=0;
      int wins=0;
      int losses=0;
      int ties=0;
      String computer = "bad";
      String player = "bad";
      String winner = "bad";
      
      
      while(!flag){
         twoflag = false;
         computer = "bad";
         player = "bad";
         winner = "bad";
         while(!twoflag){
            System.out.print("Rock (1), Paper (2) or Scissors (3) (0 to quit)? ");
            num = input.nextInt();
            if(num == 0 || num==1 || num==2 || num==3){
               twoflag = true;
            }
            else{
               System.out.println("You chose a number that is not being asked for. Please try again.");
               System.out.println("");
            }
         }
         int computernum=(int)(Math.random()*3)+1;
         if(num==0){
            System.out.println("Summary:");
            if(wins==1){
               System.out.println("You won 1 time");
            }
            else{
               System.out.println("You won " + wins +" times");
            }
            if(losses==1){
               System.out.println("The computer won 1 time");
            }
            else{
               System.out.println("The computer won " + losses +" times");
            }
            if(ties==1){
               System.out.println("You tied 1 time");
            }
            else if (ties != 1){
               System.out.println("You tied " + ties +" times"); // hardest part, copy and pasted and left losses instad of ties. Took FOREVER to find. 
            }
            flag=true;
         }
         else{
            if(computernum==1){
               computer = "Rock";
            }
            else if(computernum==2){
               computer = "Paper";
            }
            else if(computernum==3){
               computer = "Scissors";
            }
            if(num==1){
               player = "Rock";
            }
            else if(num==2){
               player = "Paper";
            }
            else if(num==3){
               player = "Scissors";
            }
            if(computer == "Rock" && player == "Scissors" || computer == "Paper" && player == "Rock" || computer == "Scissors" && player == "Paper"){
               winner = "Computer wins!";
            }
            else if(player == "Rock" && computer == "Scissors" || player == "Paper" && computer == "Rock" || player == "Scissors" && computer == "Paper"){
               winner = "You win!";
            }
            else if(player == computer){
               winner = "It's a tie!";
            }
            
            if(winner == "You win!"){
               wins++;
            }
            else if(winner == "Computer wins!"){
               losses++;
            }
            else if(winner == "It's a tie!"){
               ties++;
            }
            System.out.println("You chose " + player + " and the computer chose " + computer);
            System.out.println(winner);
            System.out.println("");
         }
      }
   }
}