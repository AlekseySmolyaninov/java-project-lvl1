package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import java.util.Random;

public class Calc {
    public static void gameCalc() {

        String rule = "What is the result of the expression?";

        String[][] questionAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber1 = RandomUtils.nextInt(1, 10);  // загадываем число
            int randomNumber2 = RandomUtils.nextInt(1, 10); // загадываем число 2

            questionAndAnswers[i][0] = String.valueOf(randomNumber1);
            questionAndAnswers[i][1] = String.valueOf(randomNumber2);
        }
        Engine.play(rule, questionAndAnswers);
    }
}









