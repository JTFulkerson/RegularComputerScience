public class PointCSBasicTest {
    public static void main(String[] args) {
        PointCS p2= new PointCS (-4, -3);
        System.out.println(p2.getX()); //-4.0
        System.out.println(p2.getY()); //-3.0
        p2.setX(2.1);
        p2.setY(-4.6);
        System.out.println(p2.getX()); //2.1
        System.out.println(p2.getY()); //-4.6
    }
}