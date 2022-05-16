public class Madlibs2 { 
       public static void main(String[] args) 
      { 
         String[] nouns = {"banana", "Ferrari", "hammer", "guacamole", "bug-eyed monster", "bike", "tacos", "witch", "creature", "child"};
         String[] verbs = {"eat", "drive", "whack", "transmogrify", "admire", "chop", "bore", "annoy", "announce"}; 
         String[] adjectives = {"average", "silly", "proud", "helpful", "pleasant", "frantic", "cumbersome", "dizzy", "horrific", "cruel"};
         String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
          
         System.out.println("Here is a story just for you\n"); 
         tellStory(nouns,verbs, days, adjectives); // generate and display the story 
      } // end of main() 
      
       public static String getWord(String[] words) { 
         int size = words.length; // get the size of the array 
         int index = (int)(Math.random() * size); // random # must be < size 
         return words[index]; // send back the word at that index 
      } // end of getWord() method 
      
   
       public static void tellStory(String[] nouns, String[] verbs, String[] days, String[] adjectives){ 
         System.out.println("Once upon a time there was a " + getWord(adjectives) + " " + getWord(nouns) + "."); 
         System.out.println("All it could do was " + getWord(verbs) + " the " + getWord(nouns) + " on " + getWord(days)); 
         System.out.println("but they all " + getWord(verbs) + 
            " happily ever after. The end."); 
      } // end of tellStory() method 
   
   } // end of Madlib class 
