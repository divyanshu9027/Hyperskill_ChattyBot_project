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
    public static void age() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");

    }

}
