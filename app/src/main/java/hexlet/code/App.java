package hexlet.code;


import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int gameGreet = 1;
        final int gameEven = 2;
        final int gameCalc = 3;
        final int gameGCD = 4;
        final int gameProgression = 5;
        final int gamePrime = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           Please enter the game number and press Enter.
                           1 - Greet
                           2 - Even
                           3 - Calc
                           4 - GCD
                           5 - Progression
                           6 - Prime
                           0 - Exit
                           Your choice: """);
        int gameNumber = sc.nextInt();
        if (gameNumber == 0) {
            return;
        }
        System.out.println("Welcome to the Brain Games!");

        if (gameNumber == gameGreet) {
            Cli.nameUser();
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

