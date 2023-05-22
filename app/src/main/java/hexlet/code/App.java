package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName = "";
        int playerChoice = -1;

        while (playerChoice != 0) {

            greetPlayer();

            playerChoice = scanner.nextInt();
            System.out.printf("Your choice: %s%n", playerChoice);

            switch (playerChoice) {
                case 1 -> playerName = getPlayerName(scanner);
                case 0 -> System.out.print("Goodbye.");
            }

        }
    }

    public static void greetPlayer() {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit""");
    }

    public static String getPlayerName(Scanner scannerIn) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May i have your name?");
        String playerName = scannerIn.next();
        System.out.println("Hello, " + playerName + "!");

        return playerName;
    }

}
