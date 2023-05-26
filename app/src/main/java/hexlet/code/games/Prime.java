package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void play(Scanner scannerIn) {
        String playerName;
        String playerInput;
        String correctAnswer;

        int randInt;

        playerName = Engine.greetPlayer(scannerIn);

        Engine.showRules("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {

            randInt = Engine.getRandomIntInRange(0, 101);
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
        } else if (number == 2 || number == 3) {
            return true;
        } else if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i <= Math.sqrt(number); i = i + 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

}
