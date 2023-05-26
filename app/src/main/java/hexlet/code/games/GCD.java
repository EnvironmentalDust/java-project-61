package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    public static void play(Scanner scannerIn) {
        String playerName;
        String playerInput;
        String correctAnswer;

        int randInt1;
        int randInt2;

        playerName = Engine.greetPlayer(scannerIn);

        Engine.showRules("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < 3; i++) {

            randInt1 = Engine.getRandomIntInRange(0, 101);
            randInt2 = Engine.getRandomIntInRange(0, 101);
            correctAnswer = String.valueOf(getGCD(randInt1, randInt2));

            Engine.showQuestion(String.format("%s %s", randInt1, randInt2));

            playerInput = Engine.getAnswer(scannerIn);

            if (!Engine.checkAnswer(playerInput, correctAnswer)) {
                Engine.msgTryAgain(playerName);
                return;
            }

        }

        Engine.congratulate(playerName);
    }

    public static int getGCD(int int1, int int2) {
        return (int1 % int2 == 0) ? Math.abs(int2) : getGCD(int2, int1 % int2);
    }

}