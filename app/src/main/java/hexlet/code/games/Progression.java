package hexlet.code.games;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void gameProgression() {
        String[] answers = {"Correct!", "Your answer: ", " is wrong answer ;(. Correct answer was ",
                "Let's try again, ", "Congratulations, "};
        String[] asks = {"Question: ", "What number is missing in the progression?\n Your answer: "};

        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = sc.nextLine();
        System.out.println("Привет, " + name + "!");
        System.out.println(asks[1]);

        int roundCount = 4;

        for (var i = 0; i <= roundCount; i++) {

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

            System.out.println(Arrays.toString(numbersWords)); // выводим прогрессию с неизвестным элементом

            System.out.println(asks[1]);// задаем вопрос

            String answer = sc.nextLine(); // пользователь вводит ответ

            if (answer.equals(Integer.toString(randomNumber))) {
                System.out.println(answers[0]);
            } else {
                System.out.println("\'" + answer + "\'" + answers[2] + randomNumber);
                System.out.println(answers[3]);
                return;
            }
            i = i + 1;

        } System.out.println(answers[4] + name + "!");
    }
}
