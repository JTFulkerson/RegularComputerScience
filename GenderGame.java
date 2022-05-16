// JT Fulkerson Period 3
import java.util.Scanner;
public class GenderGame {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("What is your gender (1=Male, 2=Female)? ");
      int gender = input.nextInt();
      System.out.print("First name: ");
      String first = input.next();
      System.out.print("Last name: ");
      String last = input.next();
      System.out.print("Age: ");
      int age = input.nextInt();
      if(gender==2 && age>=20){
         System.out.print("Are you married, "+first+" (1=Yes, 2=No)? ");
         int married = input.nextInt();
         if(married==1){
            String title = "Mrs.";
            System.out.println("");
            System.out.print("Then I shall call you " + title + " " + last + ".");
         }
         else{
            String title = "Ms.";
            System.out.println("");
            System.out.print("Then I shall call you " + title + " " + last + ".");
         }
      }
      if(gender==1 && age>=20){
         String title = "Mr.";
         System.out.println("");
         System.out.print("Then I shall call you " + title + " " + last + ".");
      }
      if(age<20){
      System.out.println("");
      System.out.print("Then I shall call you " + first + " " + last + ".");
      }
   }
}

