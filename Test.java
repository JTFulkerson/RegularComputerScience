public class Test {
   public static void main(String[] args) {
      int [] myArray = {4, 9, 3, 5, 6, 2, 1};
      for (int i=0; i<= myArray.length - 1; i++){
         if (myArray[i] > myArray[i + 1])
         {
            int temp = myArray[i];
            myArray[i] = myArray[i + 1];
            myArray[i + 1] = temp;
         }
      }
      System.out.println(myArray[0]);
      System.out.println(myArray[1]);
      System.out.println(myArray[2]);
      System.out.println(myArray[3]);
      System.out.println(myArray[4]);
      System.out.println(myArray[5]);
      System.out.println(myArray[6]);
                
   }
}
