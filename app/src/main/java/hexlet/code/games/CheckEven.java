package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class CheckEven {
    public static final int RANGE_MIN = -100000;
    public static final int RANGE_MAX = 100000;

    public static void play() {
        String[][] rounds = new String[Engine.MAX_NUMBER_OF_QUESTIONS][2];
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < Engine.MAX_NUMBER_OF_QUESTIONS; i++) {
            int randInt = Utils.getRandomIntInRange(RANGE_MIN, RANGE_MAX);

            rounds[i][0] = String.valueOf(randInt);
            rounds[i][1] = (randInt % 2 == 0) ? "yes" : "no";
        }

        Engine.play(rules, rounds);
    }

}
