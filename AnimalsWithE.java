//Name JT Fulkerson Period 3
import java.util.Scanner;
import java.util.Arrays;

public class AnimalsWithE { 
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int total = 0;
      System.out.print("How many animals will you enter? ");
      int howmany = input.nextInt();
      String Animals[] = new String [howmany];
      for (int i = 0; i < howmany; i++){
         System.out.print("Enter an animal: ");
         Animals[i] = input.next();
         if(Animals[i].startsWith("E")){
         total++;
         }
      }
      Arrays.sort(Animals);
      if(total==1){
      System.out.println("There was " + total + " animal that started with E.");
      System.out.println("Here it is: ");
      }
      else{
      System.out.println("There were " + total + " animals that started with E.");
      System.out.println("Here they are: ");
      }
      for(int i = 0; i < (total+1); i++){
      if(Animals[i].startsWith("E")){
      System.out.println(Animals[i]);
      }
      }
   }
}