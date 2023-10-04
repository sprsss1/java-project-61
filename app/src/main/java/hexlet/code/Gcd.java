package hexlet.code;

import static hexlet.code.Engine.*;
import static hexlet.code.Engine.randomIntGenerator;
import static java.lang.Integer.parseInt;

public class Gcd {
    public static void gcdGame() {
        String userName = welcome();
        String gameTask = "Find the greatest common divisor of given numbers.";
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
        return fNumber + " " + sNumber;
    }
    public static String answerGenerator(String string) {
        String[] splitString = string.split(" ");
        int firstNum = parseInt(splitString[0]);
        int secondNum = parseInt((splitString[1]));
        int temp;
        int answer;
        if (firstNum < secondNum) {
            temp = firstNum;
            firstNum = secondNum;
            secondNum = temp;
        }
        while (firstNum != 0 | secondNum != 0) {
            firstNum = firstNum % secondNum;
            secondNum = secondNum % firstNum;
        }
        answer = Math.max(firstNum, secondNum);


        return String.valueOf(answer);
    }
}
