package hexlet.code;

import static hexlet.code.Engine.welcome;
import static hexlet.code.Engine.randomIntGenerator;
import static hexlet.code.Engine.mainEngine;
import static java.lang.Integer.parseInt;

public class Calc {
    public static void calcGame() {
        String userName = welcome();
        String gameTask = "What is the result of the expression?";
        int questionCount = 3;
        String[] rightAnswer = new String[questionCount];
        String[] question = new String[questionCount];
        for (var i = 0; i < questionCount; i++) {
            question[i] = questionGenerator();
            rightAnswer[i] = answerGenerator(question[i]);
        }

        mainEngine(gameTask, question, rightAnswer, userName);
    }
    //all games using random questions/answers generators
    public static String questionGenerator() {
        int minValue = 1;
        int maxValue = 50;
        int fNumber = randomIntGenerator(minValue, maxValue);
        int sNumber = randomIntGenerator(minValue, maxValue);
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
