package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;


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

            int lengthOfArray = RandomUtils.nextInt(minLengthArray, maxLengthArray);
            int firstNumberOfArray = RandomUtils.nextInt(minNumberInArray, maxNumberInArray);
            int stepOfArray = RandomUtils.nextInt(minStepInArray, maxStepInArray);

            int[] progression = getProgression(firstNumberOfArray, stepOfArray, lengthOfArray);
            int randomIndex = new Random().nextInt(progression.length);

            int randomNumber = progression[randomIndex];

            questionAndAnswers[i][0] = getQuestion(progression, randomIndex);
            questionAndAnswers[i][1] = Integer.toString((randomNumber));

        }
        Engine.play(rule, questionAndAnswers);

    }

    public static int[] getProgression(int firstNumberOfArray, int stepOfArray, int lengthOfArray) {
        int[] numbersWords = new int[lengthOfArray];
        numbersWords[0] = firstNumberOfArray;
        for (int j = 1; j < numbersWords.length; j++) {
            numbersWords[j] = numbersWords[j - 1] + stepOfArray;

        }
        return numbersWords;
    }

    public static String getQuestion(int[] array, int randomIndex) {
        String[] correctProgression = new String[array.length];
        for (int i = 0; i < correctProgression.length; i++) {
            correctProgression[i] = Integer.toString(array[i]);
        }
        correctProgression[randomIndex] = "..";
        String arr = String.join(" ", correctProgression);
        return arr;
    }
}

