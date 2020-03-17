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
    public static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }
    public static void com() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1: To repeat a statement multiple times.");
        System.out.println("2: To decompose a program into several small subroutines.");
        System.out.println("3: To determine the execution time of a program.");
        System.out.println("4: To interrupt the execution of a program.");
        int choice = scanner.nextInt();
        while(choice!=2) {
            System.out.println("Please, try again.");
            choice = scanner.nextInt();
        }
    }
    public static void ans() {
        System.out.println("Congratulations, have a nice day!");
    }

    public static void main(String[] args) {

    }

}
