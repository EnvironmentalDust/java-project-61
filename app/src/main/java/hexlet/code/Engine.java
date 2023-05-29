package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_NUMBER_OF_QUESTIONS = 3;

    public static void play(String rules, String[][] rounds) {
        Scanner scanner = new Scanner(System.in);
        String playerName = Cli.welcomePlayer();

        System.out.printf("%s%n", rules);

        for (int i = 0; i < Engine.MAX_NUMBER_OF_QUESTIONS; i++) {
            String correctAnswer = String.valueOf(rounds[i][1]);

            System.out.printf("Question: %s%n", String.format(rounds[i][0]));

            String playerInput = scanner.next();
            System.out.printf("Your answer: %s%n", playerInput);

            if (playerInput.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", playerInput, correctAnswer);
                System.out.printf("Let's try again, %s!%n", playerName);
                return;
            }
        }

        System.out.printf("Congratulations, %s!%n", playerName);
    }

}
