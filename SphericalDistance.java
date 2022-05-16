//Name: JT Fulkerson   Period: 3
import java.util.Scanner;

public class SphericalDistance {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the name of the first city: ");
      String city1 = input.nextLine();
      System.out.println("Enter latitude of " + city1 + " as a decimal (N=+, S=-): ");
      double city1_latitude = input.nextDouble();
      System.out.println("Enter longitude of " + city1 + " as a decimal (E=+, W=-): ");
      double city1_longitude = input.nextDouble();
      System.out.println("Enter the name of the second city: ");
      input.nextLine();
      String city2 = input.nextLine();
      System.out.println("Enter latitude of " + city2 + " as a decimal (N=+, S=-): ");
      double city2_latitude = input.nextDouble();
      System.out.println("Enter longitude of " + city2 + " as a decimal (E=+, W=-): ");
      double city2_longitude = input.nextDouble();
      double city1_latituder = Math.toRadians(city1_latitude);
      double city1_longituder = Math.toRadians(city1_longitude);
      double city2_latituder = Math.toRadians(city2_latitude);
      double city2_longituder = Math.toRadians(city2_longitude);
      
      double part1 = Math.cos(Math.abs(city2_longituder-city1_longituder));
      double part3 = (Math.cos(city1_latitude)*Math.cos(city2_latitude)*part1);
      double part2 = (Math.sin(city1_latitude)*Math.sin(city2_latitude));
      double distance = Math.acos(part2+part3);
     
      
      System.out.println("The distance between " + city1 + " and " + city2 + " is about " + distance);
   }
     
}