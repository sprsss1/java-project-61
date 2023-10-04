package hexlet.code;

import java.util.Scanner;

import static hexlet.code.App.welcome;

public class Even {
    public static void evenGame() {
        //greeting
        //System.out.println("Welcome to the Brain Games!");
        //Scanner scanName = new Scanner(System.in);
        //System.out.println("May I have your name? ");
        //var name = scanName.next();
        //System.out.println("Hello, " + name + "!");
        String name = welcome();
        int needWin = 3;
        int winCounter = 0;
        //boolean check = true;
        for (var i = 0; i < needWin; i++) {
            //random number generator
            int minValue = 1;
            int maxValue = 50;
            int number = minValue + (int) (Math.random() * (maxValue - minValue + 1));

            String rightAnswer = "yes";

            if ((number % 2) != 0) {
                rightAnswer = "no";
            }

            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            System.out.println("Question: " + number);

            Scanner sc = new Scanner(System.in);
            String userAnswer = sc.next();

            System.out.println("Your answer: " + userAnswer);

            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
                winCounter += 1;
            } else {
                i = 5;
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
            }
        }
        //check = false;

        if (winCounter == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
