//Name JT Fulkerson and Sara Callanan Period 3
public class Building {
    public static void main(String[] args) {
        drawTop();
        drawWindows();
        drawWindows();
        drawWindows();
        drawWindows();
        drawWindows();
        drawBottom();
    }  
    public static void drawWindows() {
        System.out.println("| _  _ |");
        System.out.println("||_||_||");
    }
    public static void drawTop(){
        System.out.println("  ____  ");
        System.out.println(" /\"\"\"\"\\");
    }
    public static void drawBottom(){
        System.out.println("|  __  |");
        System.out.println("| |__| |");
        System.out.println("|______|");
    }
}
