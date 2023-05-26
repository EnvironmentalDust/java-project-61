package hexlet.code.games;

import java.util.Scanner;

import hexlet.code.Engine;

public class Calc {
    public static final int RANGE_MIN = -10;
    public static final int RANGE_MAX = 10;
    public static final int MAX_OPERATIONS = 3;

    public static void play(Scanner scannerIn) {
        String playerName;
        String playerInput;
        String correctAnswer;

        int randInt1;
        int randInt2;
        String operation;
        String[] mathOps = getMathOps();

        playerName = Engine.greetPlayer(scannerIn);

        Engine.showRules("What is the result of the expression?");

        for (int i = 0; i < Engine.getMaxNumberOfQuestions(); i++) {

            randInt1 = Engine.getRandomIntInRange(RANGE_MIN, RANGE_MAX);
            randInt2 = Engine.getRandomIntInRange(RANGE_MIN, RANGE_MAX);
            operation = mathOps[Engine.getRandomIntInRange(0, MAX_OPERATIONS)];
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

    public static String[] getMathOps() {
        String[] mathOps = new String[MAX_OPERATIONS];

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
