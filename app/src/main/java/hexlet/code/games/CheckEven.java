package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class CheckEven {

    public static void play(Scanner scannerIn) {
        String playerName;
        String playerInput;
        String correctAnswer;
        int randInt;

        playerName = Greet.greetPlayer(scannerIn);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {

            randInt = getRandomIntInRange(-100000, 100000);

            System.out.printf("Question: %s%n", randInt);
            playerInput = scannerIn.next();
            System.out.printf("Your answer: %s%n", playerInput);

            correctAnswer = (randInt % 2 == 0) ? "yes" : "no";

            if (playerInput.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", playerInput, correctAnswer);
                return;
            }

        }

        System.out.printf("Congratulations, %s!%n", playerName);
    }

    public static int getRandomIntInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

}
