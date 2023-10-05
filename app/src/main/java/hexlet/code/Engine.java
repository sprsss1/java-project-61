package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Calc.calcGame;
import static hexlet.code.Even.evenGame;
import static hexlet.code.Gcd.gcdGame;
import static hexlet.code.Prime.primeGame;
import static hexlet.code.Progression.progressionGame;

public class Engine {
    public static void mainMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
    }
    public static void launchGame() {
        Scanner sc = new Scanner(System.in);

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
            case 6:
                primeGame();
                break;
            default:
                System.out.println("Your choise is incorrect. Goodbye!");
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
    public static int randomIntGenerator(int min, int max) { //use random numbers generator
        return min + (int) (Math.random() * (max - min + 1));
    }

    public static void mainEngine(String gameTask, String[] question, String[] rightAnswer, String userName) {
        int needWin = 3;
        int winCounter = 0;

        for (var i = 0; i < needWin; i++) {

            System.out.println(gameTask);
            System.out.println("Question: " + question[i]);

            Scanner sc = new Scanner(System.in);
            String userAnswer = sc.next();

            System.out.println("Your answer: " + userAnswer);

            if (userAnswer.equals(rightAnswer[i])) {
                System.out.println("Correct!");
                winCounter += 1;
            } else {

                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + rightAnswer[i] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                i = 5;
            }
        }

        if (winCounter == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
