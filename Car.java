//Name JT Fulkerson Period 3

public class Car {
   private String color;
   private double speed;
   public Car(String inColor, double inSpeed) {
      color = inColor;
      speed = inSpeed;
   }
   public Car() {
      color = "black";
      speed = 0.0;
   }
   public void setColor(String inColor) {
      color = inColor;
   }
   public void setSpeed(double inSpeed) {
      speed = inSpeed;
   }
   public String getColor() {
      return color;
   }
   public double getSpeed() {
      return speed;
   }
   public String toString() {
      return "I am a car with speed " + speed + " and color " + color;
   }
   public String go() {
      speed = 60;
      return "The car is moving with speed of " + speed;
   }
   public String go(double inSpeed) {
      speed = inSpeed;
      return "The car is moving with speed " + speed;
   }
   public String stop() {
      speed = 0;
      return "The car is not moving. The speed is " + speed;
   }
}