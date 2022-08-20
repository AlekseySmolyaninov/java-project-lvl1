package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;

public class GCD {
    public static void gameGcd() {
        String[] answers = {"Correct!", "Your answer: ", " is wrong answer ;(. Correct answer was ",
                "Let's try again, ", "Congratulations, "};
        String[] asks = {"Question: ", "Find the greatest common divisor of given numbers."};

        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = sc.nextLine();
        System.out.println("Привет, " + name + "!");
        System.out.println(asks[1]);

        int roundCount = 4;
        int result = 0;
        for (var i = 0; i <= roundCount; i++) {
            int randomNumber1 = RandomUtils.nextInt(1, 20);  // загадываем число
            int randomNumber2 = RandomUtils.nextInt(1, 50); // загадываем число 2
            System.out.println(asks[0] + randomNumber1 + " " + randomNumber2);
            System.out.print(answers[1]);
            while (randomNumber1 != randomNumber2) {
                if (randomNumber1 > randomNumber2) {
                    randomNumber1 = randomNumber1 - randomNumber2;
                } else {
                    randomNumber2 = randomNumber2 - randomNumber1;
                }
            }
            result = randomNumber1;

            String answer = sc.nextLine();
            if (answer.equals(Integer.toString(result))) {
                System.out.println("Correct!");
            } else {
                System.out.println("\'" + answer + "\'" + answers[2] + "\'" + result + "\'" + "!");
                System.out.println(answers[3] + name + "!");
                return;
        } i = i + 1;
            } System.out.println(answers[4] + name + "!");

        }
    }

