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
        final int sizeOfArray = 2;

        String[][] questionAndAnswers = new String[Engine.ROUNDS][sizeOfArray];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber1 = RandomUtils.nextInt(minRandomNumber1, maxRandomNumber1);  // загадываем число
            int randomNumber2 = RandomUtils.nextInt(minRandomNumber2, maxRandomNumber2); // загадываем число 2
            String[] operators = {"+", "-", "*"};

            String operator = getOperator(operators);
            int result = getCalc(randomNumber1, operator, randomNumber2);

            questionAndAnswers[i][0] = randomNumber1 + " " + operator + " " + randomNumber2;
            questionAndAnswers[i][1] = String.valueOf(result);


        }
        Engine.play(rule, questionAndAnswers);
    }

    public static String getOperator(String[] operators) {

        int randomOperators = new Random().nextInt(operators.length);
        String operator = null;
        switch (operators[randomOperators]) {
            case "+":
                operator = "+";
                break;
            case "-":
                operator = "-";
                break;
            case "*":
                operator = "*";
                break;
            default:
                break;
        }
        return operator;
    }

    public static int getCalc(int randomNumber1, String operator, int randomNumber2) {
        int result = 0;
        switch (operator) {
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
        } return result;
    }
}









