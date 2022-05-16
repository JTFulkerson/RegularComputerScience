import java.util.Arrays;
public class ArrayLibrary {
    //reverse an array
   public static void reverse(int[] array) {
      System.out.println("Tesing reverse:");
      System.out.println("Original: " + Arrays.toString(array));
      for(int i = 0; i < array.length / 2; i++){
         int temp = array[i];
         array[i] = array[array.length - 1 - i];
         array[array.length - 1 - i] = temp;    
      
      }
      System.out.println("Reversed: " + Arrays.toString(array));
   }
    
    //shuffle an array
   public static void shuffle(int[] array) {
      System.out.println("Tesing shuffle:");
      System.out.println("Original: " + Arrays.toString(array));
      int temp;
      for(int n = 1; n<=20; n++){
         int i = (int)(Math.random() * array.length);
         int j = (int)(Math.random() * array.length);
         temp = array[i];
         array[i] = array[j];
         array[j]=temp;
      }
      System.out.println("Shuffled: " + Arrays.toString(array));
   }

    //create a new array of size parameter
    //filled with random numbers 1 - 20
   public static int[] create(int size) {
        int[] newArray = new int[size];
        for(int i; 0 < size; i++){
        newArray[i] = (int)(Math.random()*20);
        }
      return new int[]{};
   }

    //returns how many times the array contains the value
   public static int howManyOf(int[] array, int value) {
       //replace the line below with your code
      return 0;
   }
    
    //returns true if the array contains the value
    //returns false otherwise
   public static boolean contains(int[] array, int value) {
       //replace the line below with your code
      return false;
   }
    

   public static void main(String[] args) {
      int[] original = {2, 4, 4, 6, 8, 8};
      int length = 6;
      reverse(original);
      System.out.println("");
      shuffle(original);
      System.out.println("");
      create(length);
   } 
}
