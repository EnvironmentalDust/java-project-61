package hexlet.code.games;

import java.util.Scanner;

import hexlet.code.Engine;

public class Calc {
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

        for (int i = 0; i < 3; i++) {

            randInt1 = Engine.getRandomIntInRange(-10, 10);
            randInt2 = Engine.getRandomIntInRange(-10, 10);
            operation = mathOps[Engine.getRandomIntInRange(0, 3)];
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
        String[] mathOps = new String[3];
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
