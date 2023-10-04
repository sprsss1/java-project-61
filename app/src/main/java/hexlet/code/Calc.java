package hexlet.code;

import static hexlet.code.Engine.*;

public class Calc {
    public static void calcGame() {
        String userName = welcome();
        String gameTask = "What is the result of the expression?";
        int firstNumber = randomIntGenerator();
        int secondNumber = randomIntGenerator();
        int answer = firstNumber + secondNumber;
        String rightAnswer = String.valueOf(answer);
        String question = firstNumber + " + " + secondNumber;


        mainEngine(gameTask, question, rightAnswer, userName);
    }

}
