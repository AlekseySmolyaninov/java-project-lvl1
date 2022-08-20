package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void gameCalc() {
        String[] answers = {"Correct!", "is wrong answer ;(. Correct answer was ", "Let's try again, ", "Your answer: ", "Congratulation, "};
        String[] asks = {"What is the result of the expression?", "Question: "};
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = sc.nextLine();
        System.out.println("Привет, " + name + "!");
        System.out.println(asks[0]);

        int roundCount = 4;
        for (var i = 0; i <= roundCount; i++) {
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

            System.out.println(asks[1] + randomNumber1 + operators[z] + randomNumber2); // вопрос игроку
            String answer = sc.nextLine();// ответ игрока

                   if (answer.equals(Integer.toString(result))) {
                       System.out.println(answers[0]);
                   } else {
                       System.out.println("\'" + answer + "\'" + " " + answers[1] + "\'" + result + "\'" + "!");
                       System.out.println(answers[2] + name + "!");
                return;

            } i = i + 1;
    } System.out.println(answers[4] + name + "!");
}
}








