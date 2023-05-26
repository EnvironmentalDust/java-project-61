package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class CheckEven {
    static int rangeMin = -100000;
    static int rangeMax = 100000;

    public static void play(Scanner scannerIn) {
        String playerName;
        String playerInput;
        String correctAnswer;
        int randInt;

        playerName = Engine.greetPlayer(scannerIn);

        Engine.showRules("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < Engine.numberOfQuestions; i++) {

            randInt = Engine.getRandomIntInRange(rangeMin, rangeMax);
            correctAnswer = (randInt % 2 == 0) ? "yes" : "no";

            Engine.showQuestion(String.valueOf(randInt));

            playerInput = Engine.getAnswer(scannerIn);

            if (!Engine.checkAnswer(playerInput, correctAnswer)) {
                Engine.msgTryAgain(playerName);
                return;
            }

        }

        Engine.congratulate(playerName);
    }

}
