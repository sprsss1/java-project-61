package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.welcome;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        var choise = sc.nextInt();
        System.out.println("Your choise: " + choise);
        switch (choise) {
            case 1:
                System.out.println("Welcome to the Brain Games!");
                welcome();
                break;
            default:
                System.out.println("Goodbye!");

        }

    }
}
