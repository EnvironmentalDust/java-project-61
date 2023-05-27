package hexlet.code.games;

import java.util.Scanner;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final int RANGE_MIN = -10;
    public static final int RANGE_MAX = 10;
    public static final int MAX_OPERATIONS = 3;

    public static void play(Scanner scannerIn) {
        String[] questions = new String[3];
        String[] answers = new String[3];

        String[] mathOps = getMathOps();

        String rules = "What is the result of the expression?";

        for (int i = 0; i < Engine.MAX_NUMBER_OF_QUESTIONS; i++) {
            int randInt1 = Utils.getRandomIntInRange(RANGE_MIN, RANGE_MAX);
            int randInt2 = Utils.getRandomIntInRange(RANGE_MIN, RANGE_MAX);
            String operation = mathOps[Utils.getRandomIntInRange(0, MAX_OPERATIONS)];

            answers[i] = String.valueOf(evaluateExpression(randInt1, randInt2, operation));
            questions[i] = String.format("%s %s %s", randInt1, operation, randInt2);
        }

        Engine.play(scannerIn, rules, questions, answers);
    }

    public static String[] getMathOps() {
        return new String[] {"+", "-", "*"};

    }

    public static int evaluateExpression(int int1, int int2, String operation) {

        return switch (operation) {
            case "+" -> int1 + int2;
            case "-" -> int1 - int2;
            case "*" -> int1 * int2;
            default -> 0;
        };

    }

}
