package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import java.util.Random;

public class Calc {
    public static void gameCalc() {

        String rule = "What is the result of the expression?";

        String[][] questionAndAnswers = new String[Engine.rounds][4];

        for (var i = 0; i < Engine.rounds; i++) {
            int randomNumber1 = RandomUtils.nextInt(1, 10);  // загадываем число
            int randomNumber2 = RandomUtils.nextInt(1, 10); // загадываем число 2
            String[] operators = {"+", "-", "*"};
            int z = new Random().nextInt(operators.length);
            int result = 0;
            switch (operators[z]) {
                case "+":
                    result = randomNumber1 + randomNumber2;
                    break;
                case "-":
                    result = randomNumber1 - randomNumber2;
                    break;
                case "*":
                    result = randomNumber1 * randomNumber2;
                    break;
            }
            questionAndAnswers[i][0] = String.valueOf(randomNumber1);
            questionAndAnswers[i][1] = String.valueOf(randomNumber2);
            questionAndAnswers[i][2] = String.valueOf(result);
            questionAndAnswers[i][3] = operators[z];
        }
        Engine.play(rule, questionAndAnswers);
    }
}









