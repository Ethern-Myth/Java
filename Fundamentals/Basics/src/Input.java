import java.util.Scanner;
import java.io.Console;

public class Input {
    //Must have constructors global for easier access
    static Scanner in = new Scanner(System.in);
    static Console console = System.console();

    public static void main(String[] args) {
        // System.out.print("What's your name? ");
        // String name = in.next();
        // String name = GetName();
        // System.out.println("Thanks, "+name);
        Display(GetName());
    }

    public static void Display(String name){
        System.out.printf("Thanks, %s",name);
    }

    //Function to get name
    public static String GetName(){
        String name = console.readLine("What's your name? ");
        return name;
    }
}
