package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void welcomePlayer() {
        System.out.println("May i have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
}
