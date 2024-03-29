package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class GCD {
    public static void gameGcd() {

        String rule = "Find the greatest common divisor of given numbers.";

        final int minRandomNumber1 = 1;
        final int maxRandomNumber1 = 20;
        final int minRandomNumber2 = 1;
        final int maxRandomNumber2 = 50;
        final int sizeOfArray = 2;

        String[][] questionAndAnswers = new String[Engine.ROUNDS][sizeOfArray];


        for (var i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber1 = RandomUtils.nextInt(minRandomNumber1, maxRandomNumber1);  // загадываем число
            int randomNumber2 = RandomUtils.nextInt(minRandomNumber2, maxRandomNumber2); // загадываем число 2

            questionAndAnswers[i][0] = randomNumber1 + " " + randomNumber2;
            questionAndAnswers[i][1] = String.valueOf(getGSD(randomNumber1, randomNumber2));

        }
        Engine.play(rule, questionAndAnswers);
    }

    public static int getGSD(int randomNumber1, int randomNumber2) {
        while (randomNumber1 != randomNumber2) {
            if (randomNumber1 > randomNumber2) {
                randomNumber1 = randomNumber1 - randomNumber2;
            } else {
                randomNumber2 = randomNumber2 - randomNumber1;
            }
        }
        return randomNumber1;
    }
}
