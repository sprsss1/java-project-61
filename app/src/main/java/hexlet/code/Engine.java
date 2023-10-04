package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String welcome() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanName = new Scanner(System.in);
        System.out.println("May I have your name? ");
        var name = scanName.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }
    public static int randomIntGenerator() {
        int minValue = 1;
        int maxValue = 50;
        return minValue + (int) (Math.random() * (maxValue - minValue + 1));
    }

    public static void mainEngine(String gameTask, String userName) {
        int needWin = 3;
        int winCounter = 0;

        for (var i = 0; i < needWin; i++) {

            int question = randomIntGenerator();


            String rightAnswer = "yes";

            if ((question % 2) != 0) {
                rightAnswer = "no";
            }

            System.out.println(gameTask);
            System.out.println("Question: " + question);

            Scanner sc = new Scanner(System.in);
            String userAnswer = sc.next();

            System.out.println("Your answer: " + userAnswer);

            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
                winCounter += 1;
            } else {
                i = 5;
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + rightAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
            }
        }
        //check = false;

        if (winCounter == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
