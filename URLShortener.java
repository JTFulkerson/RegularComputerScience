//Name: JT Fulkerson, Jayden Kim, Nicholas Pereira   Period: 3
public class URLShortener {

   public static String shortenURL(String inputURL) {
    
      String outputURL = "https://www.icecreamsuggestor.io/";
    
      int colon = inputURL.indexOf(":");
      String http = inputURL.substring(0, colon);
      int dot = inputURL.indexOf(".");
      int endDot = inputURL.lastIndexOf(".");
      String subdomain = inputURL.substring(colon+3,dot);
      String domain = inputURL.substring(dot+1,endDot);
      String top = inputURL.substring(endDot+1);
       
      String bowl = "bowl";
      if(http.endsWith("s")) {
         bowl = "cone-with-";
      }
      else if(http.endsWith("p")) {
         bowl = "cup-with-";
      }
      outputURL += bowl;
       
      String topping = "topping";
      if (top.equals("edu")) {
         topping = "sprinkles";
      }
      else if (top.equals("com")) {
         topping = "cherrys";
      }
      else if (top.equals("net")) {
         topping = "oreos";
      }
      else if (top.equals("org")) {
         topping = "cookies";
      }
      else if (top.equals("gov")) {
         topping = "marshmallows";
      }
      else if (top.equals("mil")) {
         topping = "reese's";
      }
      else if (top.equals("uk")) {
         topping = "fudge";
      }
      else if (top.equals("cc")) {
         topping = "walnuts";
      }
      else if (top.equals("io")) {
         topping = "coconut";
      }
       
      outputURL += topping + "-ontop-of-";
      outputURL += getFlavor(domain.charAt(0)) + "-and-";
       outputURL += getFlavor(domain.charAt(1)) + "-ice-cream";
       
      return outputURL;
       
   }
    
   public static String getFlavor(char letter) {
      if (letter == 'c') {
         return "chocolate";
      }
      else if (letter == 'k') {
         return "key-lime";
      }
      else if (letter == 'm') {
         return "mint-chocolate-chip";
      }
      else if (letter == 'n') {
         return "neapolitan";
      }
      else if (letter == 'o') {
         return "orange";
      }
      else if (letter == 'p') {
         return "pistachio";
      }
      else if (letter == 'r') {
         return "rocky-road";
      }
      else if (letter == 's') {
         return "strawberry";
      }
      else if (letter == 't') {
         return "tripple-caramel-chunk";
      }
      else if (letter == 'w') {
         return "watermelon";
      }
      else 
         return "vanilla";
   }
   
   public static void main(String[] args) {
      System.out.println(shortenURL("https://www.fcps.edu"));
      System.out.println(shortenURL("https://mcleanhs.fcps.edu"));
      System.out.println(shortenURL("http://www.shadyurl.com"));
       System.out.println(shortenURL("http://www.javamail.org"));
System.out.println(shortenURL("http://www.apple.com"));
System.out.println(shortenURL("http://www.arbor.com"));
System.out.println(shortenURL("http://www.wix.com"));
System.out.println(shortenURL("http://www.wsj.com"));
System.out.println(shortenURL("http://www.1and1.com"));
System.out.println(shortenURL("http://www.merriam-webster.com"));
System.out.println(shortenURL("http://www.reuters.com"));
System.out.println(shortenURL("http://www.readers.com"));
System.out.println(shortenURL("https://www.fit.edu"));
System.out.println(shortenURL("http://www.fit.edu"));
System.out.println(shortenURL("https://www.fortlewis.edu"));
System.out.println(shortenURL("https://www.codepost.io"));
System.out.println(shortenURL("http://www.speedtest.net"));
System.out.println(shortenURL("http://web.javamail.org"));

   }

}