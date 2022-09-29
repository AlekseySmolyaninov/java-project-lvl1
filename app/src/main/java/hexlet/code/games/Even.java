package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;


public class Even {
    public static void gameEven() {

        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        final int minNumber = 1;
        final int maxNumber = 1000;
        final int sizeOfArray = 2;
        String[][] questionAndAnswers = new String[Engine.ROUNDS][sizeOfArray];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            int randomNumber = RandomUtils.nextInt(minNumber, maxNumber);

            questionAndAnswers[i][0] = String.valueOf(randomNumber);
            questionAndAnswers[i][1] = isEven(randomNumber) ? "yes" : "no";
        }
        Engine.play(rule, questionAndAnswers);
    }

    public static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;

    }
}
