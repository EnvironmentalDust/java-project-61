package hexlet.code;

import java.util.Scanner;

import static hexlet.code.games.Greet.greetPlayer;
import hexlet.code.games.CheckEven;
import hexlet.code.games.Calc;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerChoice;

        showMenu();

        playerChoice = scanner.next();
        System.out.printf("Your choice: %s%n%n", playerChoice);

        if (playerChoice.equals("1")) {
            greetPlayer(scanner);
        } else if (playerChoice.equals("2")) {
            CheckEven.play(scanner);
        } else if (playerChoice.equals("3")) {
            Calc.play(scanner);
        } else if (playerChoice.equals("0")) {
            System.out.println("Goodbye.");
        } else {
            System.out.println("Wrong input.");
        }

        scanner.close();
    }

    public static void showMenu() {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit""");
    }

}
