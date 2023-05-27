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
        String playerChoice;

        showMenu();

        playerChoice = scanner.next();
        System.out.printf("Your choice: %s%n%n", playerChoice);

        switch (playerChoice) {
            case "1" -> Engine.greetPlayer(scanner);
            case "2" -> CheckEven.play(scanner);
            case "3" -> Calc.play(scanner);
            case "4" -> GCD.play(scanner);
            case "5" -> Progression.play(scanner);
            case "6" -> Prime.play(scanner);
            case "0" -> System.out.println("Goodbye.");
            default -> System.out.println("Wrong input.");
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
