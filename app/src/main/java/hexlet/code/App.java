package hexlet.code;

import hexlet.code.games.CheckEven;

import java.util.Scanner;

import static hexlet.code.games.Greet.greetPlayer;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerChoice = "";

        while (!playerChoice.equals("0")) {

            showMenu();

            playerChoice = scanner.next();
            System.out.printf("Your choice: %s%n%n", playerChoice);

            if (playerChoice.equals("1")) {
                greetPlayer(scanner);
            } else if (playerChoice.equals("2")) {
                CheckEven.play(scanner);
            } else if (playerChoice.equals("0")) {
                System.out.print("Goodbye.");
                return;
            } else {
                System.out.print("Wrong input.");
                return;
            }

        }
    }

    public static void showMenu() {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit""");
    }

}
