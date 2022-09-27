package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;

public class GCD {
    public static void gameGcd() {

        String rule = "Find the greatest common divisor of given numbers.";

        String[][] questionAndAnswers = new String[Engine.ROUNDS][2];


        int result = 0;
        for (var i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber1 = RandomUtils.nextInt(1, 20);  // загадываем число
            int randomNumber2 = RandomUtils.nextInt(1, 50); // загадываем число 2

            questionAndAnswers[i][0] = String.valueOf(randomNumber1);
            questionAndAnswers[i][1] = String.valueOf(randomNumber2);


        }
        Engine.play(rule, questionAndAnswers);
    }
}
