import java.util.Scanner;

public class CaesarDecode {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println ("Enter your encoded word letter by letter");
      System.out.print("Enter First Letter: ");
      char one = input.next().charAt(0);
      System.out.print("Enter Second Letter: ");
      char two = input.next().charAt(0);
      System.out.print("Enter Third Letter: ");
      char three = input.next().charAt(0);
      System.out.print("Enter Fourth Letter: ");
      char four = input.next().charAt(0);
      System.out.print("Enter Fifth Letter: ");
      char five = input.next().charAt(0);
      System.out.print("Enter Sixth Letter: ");
      char six = input.next().charAt(0);
      System.out.print("Enter Seventh Letter: ");
      char seven = input.next().charAt(0);
      System.out.print("Enter Eighth Letter: ");
      char eight = input.next().charAt(0);
      System.out.print("Enter Ninth Letter: ");
      char nine = input.next().charAt(0);
      System.out.print("Enter Tenth Letter: ");
      char ten = input.next().charAt(0);
      
      int none = (int)(one) - 3;
      int ntwo = (int)(two) - 6;
      int nthree = (int)(three) - 3;
      int nfour = (int)(four) - 3;
      int nfive = (int)(five) - 4;
      int nsix = (int)(six) - 3;
      int nseven = (int)(seven) - 9;
      int neight = (int)(eight) - 3;
      int nnine = (int)(nine) - 7;
      int nten = (int)(ten) - 3;
      
      char fone = (char)(none);
      char ftwo = (char)(ntwo);
      char fthree = (char)(nthree);
      char ffour = (char)(nfour);
      char ffive = (char)(nfive);
      char fsix = (char)(nsix);
      char fseven = (char)(nseven);
      char feight = (char)(neight);
      char fnine = (char)(nnine);
      char ften = (char)(nten);
      System.out.print("The word is encoded to ");
      if(none!='_'){
         System.out.print(fone);
      }
      if(ntwo!='_'){
         System.out.print(ftwo);
      }
      if(nthree!='_'){
         System.out.print(fthree);
      }
      if(nfour!='_'){
         System.out.print(ffour);
      }
      if(nfive!='_'){
         System.out.print(ffive);
      }
      if(nsix!='_'){
         System.out.print(fsix);
      }
      if(nseven!='_'){
         System.out.print(fseven);
      }
      if(neight!='_'){
         System.out.print(feight);
      }
      if(nnine!='_'){
         System.out.print(fnine);
      }
      if(nten!='_'){
         System.out.print(ften);
      }    
   }
}