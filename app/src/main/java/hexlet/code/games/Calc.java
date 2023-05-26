package hexlet.code.games;

import java.util.Scanner;

import hexlet.code.Engine;

public class Calc {
    public static void play(Scanner scannerIn) {
        int maxOperations = 3;
        int rangeMin = -10;
        int rangeMax = 10;

        String playerName;
        String playerInput;
        String correctAnswer;

        int randInt1;
        int randInt2;
        String operation;
        String[] mathOps = getMathOps(maxOperations);

        playerName = Engine.greetPlayer(scannerIn);

        Engine.showRules("What is the result of the expression?");

        for (int i = 0; i < Engine.getMaxNumberOfQuestions(); i++) {

            randInt1 = Engine.getRandomIntInRange(rangeMin, rangeMax);
            randInt2 = Engine.getRandomIntInRange(rangeMin, rangeMax);
            operation = mathOps[Engine.getRandomIntInRange(0, maxOperations)];
            correctAnswer = String.valueOf(evaluateExpression(randInt1, randInt2, operation));

            Engine.showQuestion(String.format("%s %s %s", randInt1, operation, randInt2));

            playerInput = Engine.getAnswer(scannerIn);

            if (!Engine.checkAnswer(playerInput, correctAnswer)) {
                Engine.msgTryAgain(playerName);
                return;
            }

        }

        Engine.congratulate(playerName);
    }

    public static String[] getMathOps(int maxOperations) {
        String[] mathOps = new String[maxOperations];

        mathOps[0] = "+";
        mathOps[1] = "-";
        mathOps[2] = "*";

        return mathOps;
    }

    public static int evaluateExpression(int int1, int int2, String operation) {

        if (operation.equals("+")) {
            return int1 + int2;
        } else if (operation.equals("-")) {
            return int1 - int2;
        } else if (operation.equals("*")) {
            return int1 * int2;
        }

        return 0;
    }

}
