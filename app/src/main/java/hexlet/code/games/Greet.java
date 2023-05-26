package hexlet.code.games;

import java.util.Scanner;

public class Greet {
    public static String greetPlayer(Scanner scannerIn) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String playerName = scannerIn.next();
        System.out.printf("Hello, %s!%n", playerName);

        return playerName;
    }
}
