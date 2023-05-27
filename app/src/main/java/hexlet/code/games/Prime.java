package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Scanner;

public class Prime {
    public static final int RANGE_MIN = 0;
    public static final int RANGE_MAX = 101;

    public static void play(Scanner scannerIn) {
        String[] questions = new String[3];
        String[] answers = new String[3];

        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < Engine.MAX_NUMBER_OF_QUESTIONS; i++) {
            int randInt = Utils.getRandomIntInRange(RANGE_MIN, RANGE_MAX);

            answers[i] = isPrime(randInt) ? "yes" : "no";
            questions[i] = String.format("%s", randInt);
        }

        Engine.play(scannerIn, rules, questions, answers);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }

        return true;
    }

}
