public class Angle {
   private double measure;
   public Angle(double m) {
      measure = m;
   }
   public Angle() {
      measure = 90.0;
   }
   public void setMeasure(double m) {
      measure = m;
   }
   public double getMeasure() {
      return measure;
   }
   public String toString() {
      return "Angle Measure = " + measure + " degrees";
   }
   public String calcAngleType() {
      String a = "null";
      if (measure < 90) {
         a = "acute";
      }
      else if (measure == 90) {
         a = "right";
      }
      else if (measure > 90 && measure < 180) {
         a = "obtuse";
      }
      else if (measure == 180) {
         a = "straight";
      }
      else if (measure > 180 && measure < 360) {
         a = "reflex";
      }
      else if (measure == 360) {
         a = "full";
      }
      return a;
   }
   public Angle complement() {
      double m = 90-measure;
      Angle complement = new Angle(m);
      return complement;
   }
   public Angle supplement() {
      double m = 180-measure;
      Angle supplement = new Angle(m);
      return supplement;
   }
   public Angle sum(Angle j) {
      double m = j.getMeasure() + measure;
      Angle sum = new Angle(m);
      return sum;
   }
   public Angle difference(Angle k) {
      double m = measure - k.getMeasure();
      Angle difference = new Angle(m);
      return difference;
   }
}
