package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final int RANGE_MIN = 1;
    public static final int RANGE_MAX = 101;

    public static void play() {
        String[][] rounds = new String[Engine.MAX_NUMBER_OF_QUESTIONS][2];
        String rules = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < Engine.MAX_NUMBER_OF_QUESTIONS; i++) {
            int randInt1 = Utils.getRandomIntInRange(RANGE_MIN, RANGE_MAX);
            int randInt2 = Utils.getRandomIntInRange(RANGE_MIN, RANGE_MAX);

            rounds[i][0] = String.format("%s %s", randInt1, randInt2);
            rounds[i][1] = String.valueOf(getGCD(randInt1, randInt2));
        }

        Engine.play(rules, rounds);
    }

    public static int getGCD(int int1, int int2) {
        return (int1 % int2 == 0) ? Math.abs(int2) : getGCD(int2, int1 % int2);
    }

}
