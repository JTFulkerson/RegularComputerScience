//Name JT Fulkerson Period 3

public class CarTester {
   public static void main(String[] args) {
      Car slowCar= new Car ();
      Car fastCar= new Car ("red",100);
      System.out.println(slowCar.getSpeed());// 0.0
      System.out.println(slowCar.getColor());// black
      slowCar.setSpeed(45);//
      slowCar.setColor("green");//
      System.out.println(slowCar.getSpeed());// 45.0
      System.out.println(slowCar.getColor());// green
      System.out.println(slowCar);// I am a car with speed 45.0 and color green
      System.out.println(slowCar.go());// The car is moving with speed of 60.0
      System.out.println(slowCar.go(50));// The car is moving with speed 50.0
      System.out.println(slowCar.stop());// The car is not moving. The speed is 0.0
      
      System.out.println(fastCar.getSpeed());// 100.0
      System.out.println(fastCar.getColor());// red
      fastCar.setSpeed(0);//
      fastCar.setColor("yellow");//
      System.out.println(fastCar.getSpeed());// 0.0
      System.out.println(fastCar.getColor());// yellow
      System.out.println(fastCar);// I am a car with speed 0.0 and color yellow
      System.out.println(fastCar.go());// The car is moving with speed of 60.0
      System.out.println(fastCar.go(120));// The car is moving with speed 120.0
      System.out.println(fastCar.stop());// The car is not moving. The speed is 0.0
   }
}