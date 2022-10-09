package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import java.util.Arrays;
import java.util.Random;

public class Progression {
    public static void gameProgression() {

        final int minLengthArray = 5;
        final int maxLengthArray = 10;
        final int minNumberInArray = 1;
        final int maxNumberInArray = 30;
        final int minStepInArray = 1;
        final int maxStepInArray = 7;
        final int sizeOfArray = 2;

        String rule = "What number is missing in the progression?";

        String[][] questionAndAnswers = new String[Engine.ROUNDS][sizeOfArray];
        for (var i = 0; i < Engine.ROUNDS; i++) {


            int[] lengthOfArray = new int[RandomUtils.nextInt(minLengthArray, maxLengthArray)];
            int firstNumberOfArray = RandomUtils.nextInt(minNumberInArray, maxNumberInArray);
            int stepOfArray = RandomUtils.nextInt(minStepInArray, maxStepInArray);

            String[] array = isProgression(firstNumberOfArray, stepOfArray, lengthOfArray);
            int randomIndex = new Random().nextInt(array.length);

            int randomNumber = Integer.parseInt(array[randomIndex]);
            array[randomIndex] = "..";
            questionAndAnswers[i][0] = Arrays.toString(array);
            questionAndAnswers[i][1] = Integer.toString((randomNumber));


        }
        Engine.play(rule, questionAndAnswers);

    }

    public static String[] isProgression(int firstNumberOfArray, int stepOfArray, int[] lengthOfArray) {
        String[] numbersWords = new String[lengthOfArray.length];
        lengthOfArray[0] = firstNumberOfArray;
        for (int j = 1; j < lengthOfArray.length; j++) {    // цикл
            lengthOfArray[j] = lengthOfArray[j - 1] + stepOfArray; // создаем математическую прогрессию
            for (int k = 0; k < numbersWords.length; k++) {
                numbersWords[k] = String.valueOf(lengthOfArray[k]);
            }
        }
        return numbersWords;
    }
}
