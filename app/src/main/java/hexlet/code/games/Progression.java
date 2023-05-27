package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Scanner;

public class Progression {
    public static final int RANGE_MIN = 1;
    public static final int RANGE_MAX = 100;
    public static final int PR_LENGTH_MIN = 5;
    public static final int PR_LENGTH_MAX = 11;

    public static void play(Scanner scannerIn) {
        String[] questions = new String[3];
        String[] answers = new String[3];

        String rules = "What number is missing in the progression?";

        for (int i = 0; i < Engine.MAX_NUMBER_OF_QUESTIONS; i++) {
            int prStart = Utils.getRandomIntInRange(RANGE_MIN, RANGE_MAX);
            int prStep = Utils.getRandomIntInRange(RANGE_MIN, RANGE_MAX);
            int prLength = Utils.getRandomIntInRange(PR_LENGTH_MIN, PR_LENGTH_MAX);
            int prHiddenIndex = Utils.getRandomIntInRange(1, prLength + 1);

            answers[i] = String.valueOf(prStart + (prStep * prHiddenIndex));
            questions[i] = getProgressionString(prStart, prStep, prLength).replaceFirst(answers[i], "..");
        }

        Engine.play(scannerIn, rules, questions, answers);
    }

    public static String getProgressionString(int prStart, int prStep, int prLength) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < prLength + 1; i++) {
            result.append(prStart + (prStep * i));
            result.append(" ");
        }

        return result.toString();
    }

}
