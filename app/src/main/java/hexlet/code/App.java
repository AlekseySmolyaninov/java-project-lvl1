package hexlet.code;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n 1 - Greet\n 2 - Even\n 3 - Calc\n 0 - Exit\n " +
                "Your choice: ");
        int gameNumber = sc.nextInt();
        if  (gameNumber == 0) {
            return;
        }
        System.out.println("Welcome to the Brain Games!");
        if (gameNumber == 2) {
             Even.gameEven();
        } else if (gameNumber == 3) {
            Calc.gameCalc();
        }
    }
}
