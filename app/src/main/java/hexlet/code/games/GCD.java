package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;

public class GCD {
    public static void gameGcd() {

        String rule = "Find the greatest common divisor of given numbers.";

        String[][] questionAndAnswers = new String[Engine.rounds][3];


        int result = 0;
        for (var i = 0; i < Engine.rounds; i++) {
            int randomNumber1 = RandomUtils.nextInt(1, 20);  // загадываем число
            int randomNumber2 = RandomUtils.nextInt(1, 50); // загадываем число 2

            questionAndAnswers[i][0] = String.valueOf(randomNumber1);
            questionAndAnswers[i][1] = String.valueOf(randomNumber2);

            while (randomNumber1 != randomNumber2) {
                if (randomNumber1 > randomNumber2) {
                    randomNumber1 = randomNumber1 - randomNumber2;
                } else {
                    randomNumber2 = randomNumber2 - randomNumber1;
                }
            }
            result = randomNumber1;

            questionAndAnswers[i][2] = String.valueOf(result);

        }
        Engine.play(rule, questionAndAnswers);
    }
}
