package hexlet.code;

import hexlet.code.games.Greet;

import java.util.Scanner;

public class Engine {
    public static final int MAX_NUMBER_OF_QUESTIONS = 3;

    public static String greetPlayer(Scanner scannerIn) {
        return Greet.play(scannerIn);
    }

    public static void showQuestion(String text) {
        System.out.printf("Question: %s%n", text);
    }

    public static void showRules(String text) {
        System.out.printf("%s%n", text);
    }

    public static String getAnswer(Scanner scannerIn) {
        String playerInput = scannerIn.next();
        System.out.printf("Your answer: %s%n", playerInput);

        return playerInput;
    }

    public static boolean checkAnswer(String playerInput, String correctAnswer) {
        if (playerInput.equals(correctAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", playerInput, correctAnswer);
            return false;
        }
    }

    public static void congratulate(String playerName) {
        System.out.printf("Congratulations, %s!%n", playerName);
    }

    public static void msgTryAgain(String playerName) {
        System.out.printf("Let's try again, %s!%n", playerName);
    }

    public static void play(Scanner scannerIn, String rules, String[] questions, String[] answers) {
        String playerName = Engine.greetPlayer(scannerIn);

        Engine.showRules(rules);

        for (int i = 0; i < Engine.MAX_NUMBER_OF_QUESTIONS; i++) {
            String correctAnswer = String.valueOf(answers[i]);

            Engine.showQuestion(String.format(questions[i]));

            String playerInput = Engine.getAnswer(scannerIn);

            if (!Engine.checkAnswer(playerInput, correctAnswer)) {
                Engine.msgTryAgain(playerName);
                return;
            }
        }

        Engine.congratulate(playerName);
    }

}
