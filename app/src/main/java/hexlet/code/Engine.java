package hexlet.code;


import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void play(String rule, String[][] questionAndAnswers) {

        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(rule);

        for (var i = 0; i < questionAndAnswers.length; i++) {

            var correctAnswer = (questionAndAnswers[i][1]);
            var number = questionAndAnswers[i][0];
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("\'" + answer + "\'" + " is wrong answer ;(. Correct answer was "
                        + "\'" + correctAnswer + "\'");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
