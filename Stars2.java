public class Stars2
{ 

   public static void main(String[] args)
   {
      star4();
      System.out.println();
      star5();
      System.out.println();
      star6();
      System.out.println();
      star7();
      System.out.println();
      star8();
   }
   public static void star4()
   {
      for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= 10; j++){
            System.out.print("*");
         }
         System.out.println();
      }
   }

   public static void star5()
   {
      for (int i = 1; i <= 7; i++) {
         for (int j = 1; j <= i; j++){
            System.out.print("*");
         }
         System.out.println();
      }
   }

   public static void star6()
   {
      for (int i = 1; i <= 8; i++) {
         for (int j = 1; j <= (8-i); j++){
            System.out.print("*");
         }
         System.out.println();
      }
   
   }

   public static void star7()
   {
      for (int i = 1; i <= 7; i++) {
         for (int j = 1; j <= (8-i); j++){
            System.out.print(" ");
         }
         for (int j = 1; j <= (i); j++){
            System.out.print("*");
         }
         System.out.println();
      }
   }

   public static void star8()
   {
      for (int i = 1; i <= 7; i++) {
         for (int j = 1; j <= (8-i); j++){
            System.out.print(" ");
         }
         for (int j = 1; j <= (i); j++){
            System.out.print("*");
         }
         for (int j = 1; j <= (i-1); j++){
            System.out.print("*");
         }
         System.out.println();
      }
   }
}
