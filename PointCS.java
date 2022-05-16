//Name JT Fulkerson Period 3

public class PointCS {
   private double X;
   private double Y;
   public PointCS(double x, double y) {
      X = x;
      Y = y;
   }
   public PointCS() {
      X = 0.0;
      Y = 0.0;
   }
   public void setX(double x) {
      X = x;
   }
   public void setY(double y) {
      Y = y;
   }
   public double getX() {
      return X;
   }
   public double getY() {
      return Y;
   }
   public String toString() {
      return "(" + X + ", " + Y + ")";
   }
   public void translate(double dx, double dy) {
    X += dx;
    Y += dy;
}
   public double calcDistanceFromOrigin() {
   double distance = 0.0;
      distance = Math.sqrt(((X - 0.0)*(X - 0.0)) + ((Y - 0.0)*(Y - 0.0)));
      return distance;
   }
   public String sendWarning() {
   String d = "null";
      if (calcDistanceFromOrigin() == 0.0) {
         d = "same point";
      }
      else if (calcDistanceFromOrigin() <= 3.14) {
         d = "too close";
      }
      else if (calcDistanceFromOrigin() > 3.14) {
         d = "safe distance";
      }
      return d;
   }
}