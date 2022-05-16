//Name JT Fulkerson Period 3
import java.util.Scanner;
public class Selection {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a date DD/MM/YYYY:");
      String date = input.next();
      String month=date.substring(3,5);
      if((month.equals("12")) || (month.equals("01")) || (month.equals("02"))){
         System.out.println("Winter");
      }
      else if((month.equals("03")) || (month.equals("04")) || (month.equals("05"))){
         System.out.println("Spring");
      } 
      else if((month.equals("06")) || (month.equals("07")) || (month.equals("08"))){
         System.out.println("Summer");
      } 
      else if((month.equals("09")) || (month.equals("10")) || (month.equals("11"))){
         System.out.println("Fall");
      } 
   }
}  

