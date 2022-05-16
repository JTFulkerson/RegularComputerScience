public class Flower {
   private int petals;
   private boolean isFragrant;
   private double size;
   private String color;
   //declare the other instance variables here
   
   public Flower(String c, double s, boolean i, int p) {
      petals = p;
      isFragrant = i;
      size = s;
      color = c;
      //set the other instance variables here
   }
   
   public void setPetals(int p) {
      petals = p;
   }
   public void setFragrant(boolean i) {
      isFragrant = i;
   }
   public void setSize(double s) {
      size = s;
   }
   public void setColor(String c) {
      color = c;
   }
   //add the other setters here
   
   
   public int getPetals() {
      return petals;
   }
      public boolean isFragrant() {
      return isFragrant;
   }
      public double getSize() {
      return size;
   }
      public String getColor() {
      return color;
   }
   //add the other getters here
   
   public static void main(String[] args) {
      Flower daisy = new Flower("white", 1.0, true, 5);
      System.out.println(daisy.getPetals());
      //you may add other code here, but it won't be tested
   }
}