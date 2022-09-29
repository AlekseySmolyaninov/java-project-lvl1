package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;


public class Even {
    public static void gameEven() {

        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] questionAndAnswers = new String[Engine.rounds][2];

        for (var i = 0; i < Engine.rounds; i++) {
            int minNumber = 1;
            int maxNumber = 1000;
            int randomNumber = RandomUtils.nextInt(minNumber, maxNumber);

            questionAndAnswers[i][0] = String.valueOf(randomNumber);
            questionAndAnswers[i][1] = isEven(randomNumber) ? "yes" : "no";
        }
        Engine.play(rule, questionAndAnswers);
    }

    public static boolean isEven(int randomNumber) {
        if (randomNumber % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
