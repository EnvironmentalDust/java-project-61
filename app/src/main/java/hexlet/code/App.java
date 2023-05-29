package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.CheckEven;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showMenu();

        String playerChoice = scanner.next();
        System.out.printf("Your choice: %s%n%n", playerChoice);

        switch (playerChoice) {
            case "1" -> Cli.welcomePlayer();
            case "2" -> CheckEven.play();
            case "3" -> Calc.play();
            case "4" -> GCD.play();
            case "5" -> Progression.play();
            case "6" -> Prime.play();
            case "0" -> System.out.println("Goodbye.");
            default -> System.out.println("Wrong input.");
        }
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
