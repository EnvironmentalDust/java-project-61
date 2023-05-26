package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Greet;
import hexlet.code.games.CheckEven;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerChoice;

        showMenu();

        playerChoice = scanner.next();
        System.out.printf("Your choice: %s%n%n", playerChoice);

        if (playerChoice.equals("1")) {
            Greet.play(scanner);
        } else if (playerChoice.equals("2")) {
            CheckEven.play(scanner);
        } else if (playerChoice.equals("3")) {
            Calc.play(scanner);
        } else if (playerChoice.equals("4")) {
            GCD.play(scanner);
        } else if (playerChoice.equals("5")) {
            Progression.play(scanner);
        } else if (playerChoice.equals("6")) {
            Prime.play(scanner);
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
                4 - GDC
                5 - Progression
                6 - Prime
                0 - Exit""");
    }

}
