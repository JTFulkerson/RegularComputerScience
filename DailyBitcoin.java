//Name JT Fulkerson Period 3
import java.util.Scanner;
import java.util.Arrays;

public class DailyBitcoin { 
   public static void main(String[] args) {
      double addaverage = 0;
      int aboveaverage = 0;
      int previous = 0;
      Scanner input = new Scanner(System.in);
      System.out.print("How many days? ");
      int days = input.nextInt();
      double prices[] = new double [days];
      for (int i = 0; i < days; i++){
         System.out.print("Enter Price: ");
         prices[i] = input.nextDouble();
      }
      for (int i = 0; i < days; i++){
         addaverage += prices[i];
      }
      double average = addaverage/days;
      System.out.println("The average price is $" + average);
      for (int i = 0; i < days; i++){
         if(prices[i]>average){
            aboveaverage++;
         }
      }
            System.out.println(aboveaverage + " days were above average");
      for (int i = 0; i < days-1; i++){
         if(prices[i]<prices[i+1]){
            previous++;
         }
      }
      System.out.println(previous + " days were higher than the previous day");
   }
}