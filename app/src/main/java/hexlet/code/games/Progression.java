package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void gameProgression() {

        String rule = "What number is missing in the progression?";
        String[][] questionAndAnswers = new String[Engine.rounds][2];
        for (var i = 0; i < Engine.rounds; i++) {


            int[] numbers = new int[RandomUtils.nextInt(5, 10)];
            String[] numbersWords = new String[numbers.length];
            int x = RandomUtils.nextInt(1, 30); // формируем первое случайное число массива
            int d = RandomUtils.nextInt(1, 7); // формируе  случайный шаг прогрессии

            numbers[0] = x; // задаем перый элемент массива
            for (int j = 1; j < numbers.length; j++) {    // цикл
                numbers[j] = numbers[j - 1] + d;// создаем математическую прогрессию
                for (int k = 0; k < numbersWords.length; k++) {
                    numbersWords[k] = String.valueOf(numbers[k]);
                }
            }
            int randomIndex = new Random().nextInt(numbersWords.length);  // выбираем случайный элемент созданной прогрессии
            int randomNumber = Integer.parseInt(numbersWords[randomIndex]);
            numbersWords[randomIndex] = ".."; // заменяем его на ..
//
            questionAndAnswers[i][0] = String.valueOf(randomNumber);
            questionAndAnswers[i][1] = String.join(" ", numbersWords);
        }

        Engine.play(rule, questionAndAnswers);
    }
}