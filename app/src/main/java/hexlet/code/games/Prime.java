package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    static int rangeMin = 0;
    static int rangeMax = 101;

    public static void play(Scanner scannerIn) {
        String playerName;
        String playerInput;
        String correctAnswer;

        int randInt;

        playerName = Engine.greetPlayer(scannerIn);

        Engine.showRules("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < Engine.numberOfQuestions; i++) {

            randInt = Engine.getRandomIntInRange(rangeMin, rangeMax);
            correctAnswer = isPrime(randInt) ? "yes" : "no";

            Engine.showQuestion(String.format("%s", randInt));

            playerInput = Engine.getAnswer(scannerIn);

            if (!Engine.checkAnswer(playerInput, correctAnswer)) {
                Engine.msgTryAgain(playerName);
                return;
            }

        }

        Engine.congratulate(playerName);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }

        return true;
    }

}
