public class BoxTester {
    public static void main(String[] args) {
       Box box1 = new Box(8.2, 7.7, 3);
       System.out.println(box1.getLength());//8.2
       System.out.println(box1.getWidth());//7.7
       System.out.println(box1.getHeight());//3.0
       System.out.println(box1);//Box dimensions: 8.2 x 7.7 x 3.0
       System.out.println();
       
       Box box2 = new Box(1.9);//cube constructor
       System.out.println(box2.getLength());//1.9
       System.out.println(box2.getWidth());//1.9
       System.out.println(box2.getHeight());//1.9
       System.out.println(box2);//Box dimensions: 1.9 x 1.9 x 1.9
       System.out.println();
       
       Box box3 = new Box();//default constructor
       System.out.println(box3.getLength());//1.0
       System.out.println(box3.getWidth());//1.0
       System.out.println(box3.getHeight());//1.0
       System.out.println(box3);//Box dimensions: 1.0 x 1.0 x 1.0
       System.out.println();
       
       System.out.println("Area: " + box3.calcArea()); //6.0
       System.out.println("Volume: " + box1.calcVolume());//189.42
       System.out.println(box1.biggerBox());//Box dimensions: 10.25 x 9.625 x 3.75
       Box box4 = new Box(6, 2, 7);
       System.out.println(box4.smallerBox());//Box dimensions: 4.5 x 1.5 x 5.25
       System.out.println();
       
       Box box5 = new Box (3.6, 2.9, 1.9);
       System.out.println("Without rotations: " + box5.nests(box1));//true
       System.out.println("Without rotations: " + box2.nests(box3));//false
       //System.out.println("Rotations: " + box4.nests(box1));//true
       //Box box6 = new Box(3, 4, 5);
       //System.out.println("Rotations: " + box6.nests(box4));//false
 
       
   }
}
