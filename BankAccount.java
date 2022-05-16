import java.util.Scanner;
import java.text.DecimalFormat;
public class BankAccount {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      DecimalFormat f = new DecimalFormat("0.00");
      double sum = 0;
      int weeks = 10;
      for ( int i=1; i <= weeks; i++){
         System.out.print("Week " + i + "\t$");
         double money = input.nextDouble();
         sum = sum + money;
      }
      System.out.println("You saved $" + f.format(sum) + " in total");
      System.out.println("You spent $" + f.format(sum/weeks) + " on average each week");
   }
}
