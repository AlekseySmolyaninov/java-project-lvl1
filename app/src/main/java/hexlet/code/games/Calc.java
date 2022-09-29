package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import java.util.Random;

public class Calc {

    public static final int INDEX_OF_ARRAY_FOR_OPERATORS = 3;
    public static void gameCalc() {

        String rule = "What is the result of the expression?";

        final int minRandomNumber1 = 1;
        final int maxRandomNumber1 = 10;
        final int minRandomNumber2 = 1;
        final int maxRandomNumber2 = 10;
        final int sizeOfArray = 4;

        String[][] questionAndAnswers = new String[Engine.ROUNDS][sizeOfArray];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber1 = RandomUtils.nextInt(minRandomNumber1, maxRandomNumber1);  // загадываем число
            int randomNumber2 = RandomUtils.nextInt(minRandomNumber2, maxRandomNumber2); // загадываем число 2
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
                default:
                    break;
            }
            questionAndAnswers[i][0] = String.valueOf(randomNumber1);
            questionAndAnswers[i][1] = String.valueOf(randomNumber2);
            questionAndAnswers[i][2] = String.valueOf(result);
            questionAndAnswers[i][INDEX_OF_ARRAY_FOR_OPERATORS] = operators[z];
        }
        Engine.play(rule, questionAndAnswers);
    }
}









