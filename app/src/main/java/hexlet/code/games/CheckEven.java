package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class CheckEven {

    public static void play(Scanner scannerIn) {
        String playerName;
        String playerInput;
        String correctAnswer;
        int randInt;

        playerName = Engine.greetPlayer(scannerIn);

        Engine.showRules("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {

            randInt = Engine.getRandomIntInRange(-100000, 100000);
            correctAnswer = (randInt % 2 == 0) ? "yes" : "no";

            Engine.showQuestion(String.valueOf(randInt));

            playerInput = Engine.getAnswer(scannerIn);

            if (!Engine.checkAnswer(playerInput, correctAnswer)) {
                return;
            }

        }

        Engine.congratulate(playerName);
    }

}
