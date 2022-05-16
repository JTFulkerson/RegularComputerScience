//Name: JT Fulkerson   Period: 3
import java.util.Scanner;
public class Reflection{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter Your Full Name:");
      String full_Name = input.nextLine();
      int firstnamenum = full_Name.indexOf(" ");
      char middleinitial = full_Name.charAt(firstnamenum + 1);
      System.out.println("The middle initial for " + full_Name + " is " + middleinitial);
   
   }
}