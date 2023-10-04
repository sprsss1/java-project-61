package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Engine.welcome;
import static hexlet.code.Even.evenGame;
import static hexlet.code.Calc.calcGame;
import static hexlet.code.Gcd.gcdGame;
import static hexlet.code.Progression.progressionGame;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");

        int choise = 0;

        if (sc.hasNextInt()) {
            choise = sc.nextInt();
        } else {
            System.out.println("Your choise is incorrect. Goodbye!");
            System.exit(0);
        }
        System.out.println("Your choise: " + choise);
        System.out.println();

        switch (choise) {
            case 0:
                System.out.println("Goodbye!");
                System.exit(0);
            case 1:
                welcome();
                break;
            case 2:
                evenGame();
                break;
            case 3:
                calcGame();
                break;
            case 4:
                gcdGame();
                break;
            case 5:
                progressionGame();
                break;
            default:
                System.out.println("Your choise is incorrect. Goodbye!");
                System.exit(0);


        }

    }

}
