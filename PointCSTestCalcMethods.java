public class PointCSTestCalcMethods {
    public static void main(String[] args) {
        PointCS p2= new PointCS (-4, -3);
        System.out.println (p2. calcDistanceFromOrigin());//5.0
        PointCS p3 = new PointCS(-1.27, 49.4);
        System.out.println (p3. calcDistanceFromOrigin());//49.41632220228454
        System.out.println (p3.sendWarning());//safe distance

    }
}