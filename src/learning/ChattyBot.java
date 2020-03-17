package learning;
import java.util.Scanner;

public class ChattyBot {
    final static Scanner scanner = new Scanner(System.in);
    public static void greet() {
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("please, remind me your name.");
    }
    public static void name() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have," + name + "!");
    }

}
