package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    public static void play(Scanner scannerIn) {
        int rangeMin = 1;
        int rangeMax = 100;
        int prLengthMin = 5;
        int prLengthMax = 11;

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

            prStart = Engine.getRandomIntInRange(rangeMin, rangeMax);
            prStep = Engine.getRandomIntInRange(rangeMin, rangeMax);
            prLength = Engine.getRandomIntInRange(prLengthMin, prLengthMax);
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
