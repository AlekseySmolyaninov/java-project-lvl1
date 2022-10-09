package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Prime {
    public static void gamePrime() {

        final int minRandomNumber = 1;
        final int maxRandomNumber = 20;
        final int sizeOfArray = 2;

        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] questionAndAnswers = new String[Engine.ROUNDS][sizeOfArray];
        for (int i = 0; i < Engine.ROUNDS; i++) {

            int randomNumber = RandomUtils.nextInt(minRandomNumber, maxRandomNumber);

            questionAndAnswers[i][0] = String.valueOf(randomNumber);
            questionAndAnswers[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.play(rule, questionAndAnswers);
    }

    public static boolean isPrime(int randomNumber) {
        if (randomNumber == 1) {
            return false;
        }
        for (int j = 2; j < randomNumber; j++) {
            if (randomNumber % j == 0) {
                return false;
            }
        }
        return true;
    }
}









