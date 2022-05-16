//Name: JT Fulkerson   Period: 3
import java.util.Scanner;

public class CMYKtoRGB {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter C: ");
      double Cyan = input.nextDouble();
      System.out.print("Enter M: ");
      double Magenta = input.nextDouble();
      System.out.print("Enter Y: ");
      double Yellow = input.nextDouble();
      System.out.print("Enter K: ");
      double Black = input.nextDouble();
      double Red = (255*( 1 - Cyan )*( 1 - Black  ));
      double Green = (255*( 1 - Magenta  )*( 1 - Black  ));
      double Blue = (255*( 1 - Yellow  )*( 1 - Black  ));
      int Redprint = (int)(Red+0.5);
      int Greenprint = (int)(Green+0.5);
      int Blueprint = (int)(Blue+0.5);
      System.out.println("("+Redprint + "," + Greenprint + "," + Blueprint+")");
   }
}
