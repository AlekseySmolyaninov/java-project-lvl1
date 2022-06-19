package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void nameUser() {

        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = sc.nextLine();
        System.out.println("Привет, " + name + "!");
    }
}
