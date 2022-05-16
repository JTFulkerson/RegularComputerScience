//Name: JT Fulkerson, Hannah Huang   Period: 3
import java.util.Scanner;

public class Madlibs {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = input.nextInt();
      System.out.print("Enter a sound: ");
      String sound = input.next();
      System.out.print("Enter a boolean: ");
      boolean legal = input.nextBoolean();
   
      System.out.println(number + " little ducks");
      System.out.println("That I once knew");
      System.out.println("Fat ones, skinny ones");
      System.out.println("Fair ones, too");
      System.out.println("But the one little duck");
      System.out.println("With the feather on his back");
      System.out.println("He led the others");
      System.out.println("With a " + sound + ", " + sound + ", " + sound);
      System.out.println(sound + ", " + sound + ", " + sound);
      System.out.println(sound + ", " + sound + ", " + sound);
      System.out.println("He led the others");
      System.out.println("With a " + sound + ", " + sound + ", " + sound);
      System.out.println("Down to the river");
      System.out.println("They would go");
      System.out.println("Wibble, wobble, wibble, wobble");
      if (legal){
         System.out.println("To and fro");
      }
      if (!legal){
         System.out.println("Back and forth");
      }
      System.out.println("But the one little duck");
      System.out.println("With the feather on his back");
      System.out.println("He led the others");
      System.out.println("With a " + sound + ", " + sound + ", " + sound);
      System.out.println(sound + ", " + sound + ", " + sound);
      System.out.println(sound + ", " + sound + ", " + sound);
      System.out.println("He led the others");
      System.out.println("With a " + sound + ", " + sound + ", " + sound);
      System.out.println("Back from the river");
      System.out.println("They would come");
      System.out.println("Wibble, wobble, wibble, wobble");
      System.out.println("Ho, hum, hum");
      System.out.println("But the one little duck");
      System.out.println("With the feather on his back");
      System.out.println("He led the others");
      System.out.println("With a " + sound + ", " + sound + ", " + sound);
      System.out.println(sound + ", " + sound + ", " + sound);
      System.out.println(sound + ", " + sound + ", " + sound);
      System.out.println("He led the others");
      System.out.println("With a " + sound + ", " + sound + ", " + sound + "!");    
   }
}