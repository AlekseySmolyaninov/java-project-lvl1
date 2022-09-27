package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static int ROUNDS = 4;

    public static void play(String rule, String[][] questionAndAnswers) {

        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = sc.nextLine();
        System.out.println("Привет, " + name + "!");
        System.out.println(rule);

        for (var i = 0; i < questionAndAnswers.length; i++) {
            if (rule.equals("What is the result of the expression?")) {
                String[] operators = {"+", "-", "*"};
                int z = new Random().nextInt(operators.length);
                int result = 0;
                switch (operators[z]) {
                    case "+":
                        result = Integer.parseInt(questionAndAnswers[i][0]) + Integer.parseInt(questionAndAnswers[i][1]);
                        break;
                    case "-":
                        result = Integer.parseInt(questionAndAnswers[i][0]) - Integer.parseInt(questionAndAnswers[i][1]);
                        break;
                    case "*":
                        result = Integer.parseInt(questionAndAnswers[i][0]) * Integer.parseInt(questionAndAnswers[i][1]);
                        break;
                }
                System.out.println("Question: " + questionAndAnswers[i][0] + operators[z] + questionAndAnswers[i][1]);
                String answer = sc.nextLine();

                if (Integer.parseInt(answer) == result) {
                    System.out.println("Correct");
                } else {
                    System.out.println("\'" + answer + "\'" + " is wrong answer ;(. Correct answer was " + "\'" + result + "\'");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (rule.equals("Find the greatest common divisor of given numbers.")) {
                System.out.println("Question: " + questionAndAnswers[i][0] + " " + questionAndAnswers[i][1]);
                int result;
                while (Integer.parseInt(questionAndAnswers[i][0]) != Integer.parseInt(questionAndAnswers[i][1])) {
                    if (Integer.parseInt(questionAndAnswers[i][0]) > Integer.parseInt(questionAndAnswers[i][1])) {
                        questionAndAnswers[i][0] = String.valueOf(Integer.parseInt(questionAndAnswers[i][0]) - Integer.parseInt(questionAndAnswers[i][1]));
                    } else {
                        questionAndAnswers[i][1] = String.valueOf(Integer.parseInt(questionAndAnswers[i][1]) - Integer.parseInt(questionAndAnswers[i][0]));
                    }
                }
                result = Integer.parseInt(questionAndAnswers[i][0]);


                String answer = sc.nextLine();

                if (Integer.parseInt(answer) == result) {
                    System.out.println("Correct");
                } else {
                    System.out.println("\'" + answer + "\'" + " is wrong answer ;(. Correct answer was " + "\'" + result + "\'");
                    System.out.println("Let's try again, " + name + "!");
                    return;

                }
            } else if (rule.equals("What number is missing in the progression?")) {
                var correctAnswers = questionAndAnswers[i][0];
                String correctQuestion = questionAndAnswers[i][1];
                System.out.println("Question: " + correctQuestion);
                String answer = sc.nextLine();
                if (answer.equals(correctAnswers)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("\'" + answer + "\'" + " is wrong answer ;(. Correct answer was " + "\'" + correctAnswers + "\'");
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }
            } else {
                var correctAnswer = (questionAndAnswers[i][1]);
                var number = questionAndAnswers[i][0];
                System.out.println("Question: " + number);
                String answer = sc.nextLine();

                if (answer.equals(correctAnswer)) {
                    System.out.println("Correct!");

                } else {
                    System.out.println("\'" + answer + "\'" + " is wrong answer ;(. Correct answer was " + "\'" + correctAnswer + "\'");
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }
            }
        }
        System.out.println("Congratulation, " + name + "!");
    }
}
