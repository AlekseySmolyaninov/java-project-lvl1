package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static int ROUNDS = 3;

    public static void play(String rule, String[][] questionAndAnswers) {

        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = sc.nextLine();
        System.out.println("Привет, " + name + "!");
        System.out.println(rule);

        for (var i = 0; i < questionAndAnswers.length; i++) {
            if (rule.equals("What is the result of the expression?")) {
                System.out.println("Question: " + questionAndAnswers[i][0] + questionAndAnswers[i][3] + questionAndAnswers[i][1]);
                String answer = sc.nextLine();
                    if (answer.equals(questionAndAnswers[i][2])) {
                    System.out.println("Correct");
                    } else {
                    System.out.println("\'" + answer + "\'" + " is wrong answer ;(. Correct answer was " + "\'" + questionAndAnswers[i][2] + "\'");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (rule.equals("Find the greatest common divisor of given numbers.")) {
                System.out.println("Question: " + questionAndAnswers[i][0] + " " + questionAndAnswers[i][1]);
                String answer = sc.nextLine();
                if (answer.equals(questionAndAnswers[i][2])) {
                    System.out.println("Correct");
                } else {
                    System.out.println("\'" + answer + "\'" + " is wrong answer ;(. Correct answer was " + "\'" + questionAndAnswers[i][2] + "\'");
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }
            } else if (rule.equals("What number is missing in the progression?")) {
                var correctAnswers = questionAndAnswers[i][0];
                var correctQuestion = questionAndAnswers[i][1];
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
