//Name JT Fulkerson Period 3
import java.util.Scanner;
public class HideAndSeek {
   public static void main(String[] args) throws Exception{
      Scanner input = new Scanner(System.in);
      
      int xcord = (int)(Math.random()*5)+1;
      int ycord = (int)(Math.random()*5)+1;
      int xcordguess = 0;
      int ycordguess = 0;
      int tally = 0;
      int tally2 = 0;
      boolean flag = false;
      System.out.println("Try to guess where I am hidden!");
      Thread.sleep(1000);
      System.out.println("");
      System.out.println("");
      System.out.println("");
      graph();
      while (!flag) {
         if(tally == 10){
            System.out.print("You lost...");
            flag = true;
         }
         else{
            System.out.print("Enter x: ");
            xcordguess = input.nextInt();
            System.out.print("Enter y: ");
            ycordguess = input.nextInt();
            tally++;
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            if(xcordguess==xcord && ycordguess==ycord){
               System.out.println("You found me!");
               flag = true;
            }
            else if (xcordguess > xcord){
               graph();
               System.out.println("x is to big");
               System.out.println("Try again!");
            }
            else if (xcordguess < xcord){
               graph();
               System.out.println("x is to small");
               System.out.println("Try again!");
            }
            else if (xcord==xcordguess){
               graph();
               System.out.println("x is correct");
               System.out.println("Try again!");
               while(!flag){
                  System.out.print("Enter y: ");
                  ycordguess = input.nextInt();
                  tally2++;
                  if (tally2++ == 4){
                     System.out.print("You lost...");
                     flag = true;
                  }
                  else{
                     if(ycordguess == ycord){
                        System.out.println("You found me! I was at " + "(" + xcord + "," + ycord + ")");
                        flag = true;
                     }
                     else{
                        System.out.println("Try again!");
                     }
                  }
               }
            }
         }
      }
   }
   public static void graph(){
      System.out.println(" ________________________");
      System.out.println("|    |    |    |    |    | 1");
      System.out.println("|____|____|____|____|____|");
      System.out.println("|    |    |    |    |    | 2");
      System.out.println("|____|____|____|____|____|");
      System.out.println("|    |    |    |    |    | 3");
      System.out.println("|____|____|____|____|____|");
      System.out.println("|    |    |    |    |    | 4");
      System.out.println("|____|____|____|____|____|");
      System.out.println("|    |    |    |    |    | 5");
      System.out.println("|____|____|____|____|____|");
      System.out.println(" 1    2    3    4    5");
   }
}