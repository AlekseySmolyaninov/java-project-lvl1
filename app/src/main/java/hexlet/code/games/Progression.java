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


            int[] numbers = new int[RandomUtils.nextInt(minLengthArray, maxLengthArray)];
            String[] numbersWords = new String[numbers.length];
            int x = RandomUtils.nextInt(minNumberInArray, maxNumberInArray); // формируем первое случайное число массива
            int d = RandomUtils.nextInt(minStepInArray, maxStepInArray); // формируе  случайный шаг прогрессии

            numbers[0] = x; // задаем перый элемент массива
            for (int j = 1; j < numbers.length; j++) {    // цикл
                numbers[j] = numbers[j - 1] + d; // создаем математическую прогрессию
                for (int k = 0; k < numbersWords.length; k++) {
                    numbersWords[k] = String.valueOf(numbers[k]);
                }
            }
            int randomIndex = new Random().nextInt(numbersWords.length);
            int randomNumber = Integer.parseInt(numbersWords[randomIndex]);
            numbersWords[randomIndex] = "..";
            questionAndAnswers[i][0] = String.valueOf(randomNumber);
            questionAndAnswers[i][1] = String.join(" ", numbersWords);
        }
        Engine.play(rule, questionAndAnswers);
    }
}
