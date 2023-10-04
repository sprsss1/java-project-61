package hexlet.code;

import java.util.Scanner;

import static hexlet.code.App.welcome;

public class Even {
    public static void evenGame() {
        String userName = welcome();
        int needWin = 3;
        int winCounter = 0;
        //boolean check = true;
        for (var i = 0; i < needWin; i++) {
            //random number generator
            int minValue = 1;
            int maxValue = 50;
            int question = minValue + (int) (Math.random() * (maxValue - minValue + 1));

            String rightAnswer = "yes";

            if ((question % 2) != 0) {
                rightAnswer = "no";
            }

            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
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
