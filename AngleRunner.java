class AngleRunner   {
   public static void main ( String[] args ){
      Angle p1= new Angle (23.5);
      Angle p2= new Angle ();
      Angle p3= new Angle (124.34);
      Angle p4= new Angle(180); 
      Angle p5= new Angle(217.8); 
      Angle p6= new Angle(360);
      System.out.println(p2.getMeasure());//90.0
      System.out.println( p3.getMeasure());//124.34
      System.out.println( p4.getMeasure()); //180.0
      System.out.println( p6.getMeasure());  //360.0  
      System.out.println( p3);  // Angle measure = 124.34 degrees
      System.out.println( p1.calcAngleType());//acute   
      System.out.println( p2.calcAngleType());//right     
      System.out.println( p3.calcAngleType());//obtuse       
      System.out.println(p4.calcAngleType());//straight            
      System.out.println(p5.calcAngleType());//reflex             
      System.out.println(p6.calcAngleType());//full 
      //
      Angle res1=p1.sum(p2);
      System.out.println(res1.getMeasure());//113.5
      Angle res2=p2.sum(p3);
      System.out.println(res2.getMeasure());//214.34
      Angle res3=p4.sum(p4);
      System.out.println(res3.getMeasure());//360
      //
      System.out.println( p1.complement().getMeasure());//66.5
      System.out.println( p2.complement().getMeasure());//0.0
      //
      System.out.println(p1.supplement().getMeasure());//156.5
      System.out.println(p2.supplement().getMeasure());//90.0
      System.out.println( p3.supplement().getMeasure()); //55.66      
      //
      Angle res4=p2.difference(p1);
      Angle res5=p6.difference(p1);
      System.out.println(res4.getMeasure());//66.5
      System.out.println(res5.getMeasure());//336.5
   }
}      
