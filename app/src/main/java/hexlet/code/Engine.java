package hexlet.code;

import hexlet.code.games.Greet;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static int getMaxNumberOfQuestions() {
        return 3;
    }

    public static String greetPlayer(Scanner scannerIn) {
        return Greet.greetPlayer(scannerIn);
    }

    public static int getRandomIntInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
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

}
