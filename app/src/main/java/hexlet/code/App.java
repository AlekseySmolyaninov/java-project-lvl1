package hexlet.code;


import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int gameGreet = 1;
        int gameEven = 2;
        int gameCalc = 3;
        int gameGCD = 4;
        int gameProgression = 5;
        int gamePrime = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n 1 - Greet\n 2 - Even\n 3 - Calc\n "
                + "4 - GCD\n " + "5 - Progression\n 6 - Prime\n 0 - Exit\n " + "Your choice: ");
        int gameNumber = sc.nextInt();
        if (gameNumber == 0) {
            return;
        }
        System.out.println("Welcome to the Brain Games!");

        if (gameNumber == gameGreet) {
            Greet.nameUser();
        } else if (gameNumber == gameEven) {
            Even.gameEven();
        } else if (gameNumber == gameCalc) {
            Calc.gameCalc();
        } else if (gameNumber == gameGCD) {
            GCD.gameGcd();
        } else if (gameNumber == gameProgression) {
            Progression.gameProgression();
        } else if (gameNumber == gamePrime) {
            Prime.gamePrime();
        }
    }
}

