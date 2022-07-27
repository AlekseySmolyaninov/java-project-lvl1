package hexlet.code;

import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;

public class Even {
    public static void gameEven() {
        String[] answers = {"yes", "no", "Correct!", "is wrong answer ;(. Correct answer was 'no'.\n"
                + "Let's try again, ", "is wrong answer ;(. Correct answer was 'yes'.\n"
                + "Let's try again, ", "Your answer: ", "Congratulation, "};
        String[] asks = {"Answer 'yes' if the number is even, otherwise answer 'no'.", "Question: "};
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = sc.nextLine();
        System.out.println("Привет, " + name + "!");
        System.out.println(asks[0]);

        int roundCount = 4;
        for (var i = 0; i <= roundCount; i++) {
            int randomNumber = RandomUtils.nextInt(1, 1000);
            System.out.println(asks[1] + randomNumber);
            String answer = sc.nextLine();
            if (randomNumber % 2 == 0) {  // четное
                if (answer.equals(answers[0])) { // ответ игрока равен Да
                    System.out.println(answers[2]);
                }    else {                                   // ответа игрока не равен Да
                    System.out.println("\'" + answer + "\'" + " " + answers[4] + name + "!"); //
                        return;                              // завершаем программу
                    }
            } else if (randomNumber % 2 != 0) {  // если число нечетное
                if (answer.equals(answers[1])) {              // если ответ нет
                    System.out.println(answers[2]);            //  Верно
                } else {                                       // если ответ иной
                        System.out.println("\'" + answer + "\'" + " " + answers[3] + name + "!");// неверно
                        return; // завершаем программу
                    }
            } i = i + 1;
        } System.out.println(answers[6] + name + "!");
    }
}
