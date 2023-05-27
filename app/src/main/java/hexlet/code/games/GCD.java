package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Scanner;

public class GCD {
    public static final int RANGE_MIN = 1;
    public static final int RANGE_MAX = 101;

    public static void play(Scanner scannerIn) {
        String[] questions = new String[3];
        String[] answers = new String[3];

        String rules = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < Engine.MAX_NUMBER_OF_QUESTIONS; i++) {
            int randInt1 = Utils.getRandomIntInRange(RANGE_MIN, RANGE_MAX);
            int randInt2 = Utils.getRandomIntInRange(RANGE_MIN, RANGE_MAX);

            answers[i] = String.valueOf(getGCD(randInt1, randInt2));
            questions[i] = String.format("%s %s", randInt1, randInt2);
        }

        Engine.play(scannerIn, rules, questions, answers);
    }

    public static int getGCD(int int1, int int2) {
        return (int1 % int2 == 0) ? Math.abs(int2) : getGCD(int2, int1 % int2);
    }

}
