package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    public static final int RANGE_MIN = 1;
    public static final int RANGE_MAX = 100;
    public static final int PR_LENGTH_MIN = 5;
    public static final int PR_LENGTH_MAX = 11;

    public static void play(Scanner scannerIn) {
        String playerName;
        String playerInput;
        String correctAnswer;

        int prStart;
        int prStep;
        int prLength;
        int prHiddenIndex;

        playerName = Engine.greetPlayer(scannerIn);

        Engine.showRules("What number is missing in the progression?");

        for (int i = 0; i < Engine.getMaxNumberOfQuestions(); i++) {

            prStart = Engine.getRandomIntInRange(RANGE_MIN, RANGE_MAX);
            prStep = Engine.getRandomIntInRange(RANGE_MIN, RANGE_MAX);
            prLength = Engine.getRandomIntInRange(PR_LENGTH_MIN, PR_LENGTH_MAX);
            prHiddenIndex = Engine.getRandomIntInRange(1, prLength + 1);

            correctAnswer = String.valueOf(prStart + (prStep * prHiddenIndex));

            Engine.showQuestion(getProgressionString(prStart, prStep, prLength).replaceFirst(correctAnswer, ".."));

            playerInput = Engine.getAnswer(scannerIn);

            if (!Engine.checkAnswer(playerInput, correctAnswer)) {
                Engine.msgTryAgain(playerName);
                return;
            }

        }

        Engine.congratulate(playerName);
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
