import java.util.Arrays;
public class ArrayCodeInterview {
    public static void main(String[] args) {
        //change the name of your array to your first name
        //change the values in the array:
        //  birth month, birth day,
        //  house number, zip code,
        //  any negative number, 
        //  any large positive number,
        //  keep 28 the same. 
        int[] john = {2, 17, 6812, 22101, -402, 1053, 28};
        Arrays.sort(john);
        System.out.println( Arrays.toString(john) );
        //what is the name of the array?
        //what is the element at index 0? 
        //what is the index of the element 28?
    }
}