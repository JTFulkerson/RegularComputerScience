//Name JT Fulkerson Period 3

public class Box {
   private double length;
   private double width;
   private double height;
   public Box(double l, double w, double h) {
      length = l;
      width = w;
      height = h;
   }
   public Box(double d) {
      length = d;
      width = d;
      height = d;
   }
   public Box() {
      length = 1;
      width = 1;
      height = 1;
   }
   public void setLength(double l) {
      length = l;
   }
   public void setWidth(double w) {
      width = w;
   }
   public void setHeight(double h) {
      height = h;
   }
   public double getLength() {
      return length;
   }
   public double getWidth() {
      return width;
   }
   public double getHeight() {
      return height;
   }
   public double calcVolume(){
      return length*width*height;
   }
   public double calcArea(){
      return 2*((width*length)+(height*length)+(height*width));
   }
   public String toString() {
      return "Box dimensions: " + length + " x " + width + " x " + height;
   }
   //Implicit Parameter Methods
   public boolean nests(Box outsideBox){
      if(this.getLength() < outsideBox.getLength() || this.getWidth() < outsideBox.getWidth() | this.getHeight() < outsideBox.getHeight()){
         return true;
      }
      else{
         return false;
      }
   }
   public Box biggerBox(){
      double newLength = length*1.25;
      double newWidth = width*1.25;
      double newHeight = height*1.25;
      Box biggerBox = new Box(newLength, newWidth, newHeight);
      return biggerBox;
   }
      public Box smallerBox(){
      double newLength = length - (length*.25);
      double newWidth = width - (width*.25);
      double newHeight = height - (height*.25);
      Box smallerBox = new Box(newLength, newWidth, newHeight);
      return smallerBox;
   }
}
   
