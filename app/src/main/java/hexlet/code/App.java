package hexlet.code;

import java.util.Scanner;


import static hexlet.code.Even.evenGame;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        int choise = 0;

        if (sc.hasNextInt()) {
            choise = sc.nextInt();
        } else {
            System.exit(1);
        }
        System.out.println("Your choise: " + choise);
        System.out.println();

        switch (choise) {
            case 1:
                welcome();
                break;
            case 2:
                evenGame();
                break;
            default:
                System.exit(0);


        }

    }
    public static String welcome() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanName = new Scanner(System.in);
        System.out.println("May I have your name? ");
        var name = scanName.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
