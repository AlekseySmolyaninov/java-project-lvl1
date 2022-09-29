package hexlet.code.games;

import java.util.Scanner;

public class Greet {

    public static void nameUser() {

        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
