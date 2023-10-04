package hexlet.code;

import static hexlet.code.Engine.welcome;
import static hexlet.code.Engine.randomIntGenerator;
import static hexlet.code.Engine.mainEngine;
import static java.lang.Integer.parseInt;

public class Calc {
    public static void calcGame() {
        String userName = welcome();
        String gameTask = "What is the result of the expression?";
        String[] rightAnswer = new String[3];
        String[] question = new String[3];
        int questionCount = 3;
        for (var i = 0; i < questionCount; i++) {
            question[i] = questionGenerator();
            rightAnswer[i] = answerGenerator(question[i]);
        }

        mainEngine(gameTask, question, rightAnswer, userName);
    }
    public static String questionGenerator() {
        int fNumber = randomIntGenerator();
        int sNumber = randomIntGenerator();
        return fNumber + " + " + sNumber;
    }
    public static String answerGenerator(String string) {
        String[] splitString = string.split(" ");
        int firstNum;
        firstNum = parseInt(splitString[0]);
        int secondNum = parseInt((splitString[2]));
        return String.valueOf(firstNum + secondNum);
    }
}
