package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Scanner;

public class CheckEven {
    public static final int RANGE_MIN = -100000;
    public static final int RANGE_MAX = 100000;

    public static void play(Scanner scannerIn) {
        String[] questions = new String[3];
        String[] answers = new String[3];
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < Engine.MAX_NUMBER_OF_QUESTIONS; i++) {
            int randInt = Utils.getRandomIntInRange(RANGE_MIN, RANGE_MAX);

            answers[i] = (randInt % 2 == 0) ? "yes" : "no";
            questions[i] = String.valueOf(randInt);
        }

        Engine.play(scannerIn, rules, questions, answers);
    }

}
