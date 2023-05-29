package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final int RANGE_MIN = -10;
    public static final int RANGE_MAX = 10;
    public static final int MAX_OPERATIONS = 3;

    public static void play() {
        String[][] rounds = new String[Engine.MAX_NUMBER_OF_QUESTIONS][2];
        String rules = "What is the result of the expression?";

        String[] mathOps = getMathOps();

        for (int i = 0; i < Engine.MAX_NUMBER_OF_QUESTIONS; i++) {
            int randInt1 = Utils.getRandomIntInRange(RANGE_MIN, RANGE_MAX);
            int randInt2 = Utils.getRandomIntInRange(RANGE_MIN, RANGE_MAX);
            String operation = mathOps[Utils.getRandomIntInRange(0, MAX_OPERATIONS)];

            rounds[i][0] = String.format("%s %s %s", randInt1, operation, randInt2);
            rounds[i][1] = String.valueOf(evaluateExpression(randInt1, randInt2, operation));
        }

        Engine.play(rules, rounds);
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
