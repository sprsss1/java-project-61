package hexlet.code;

import static hexlet.code.Engine.welcome;
import static hexlet.code.Engine.randomIntGenerator;
import static hexlet.code.Engine.mainEngine;
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
    //all games using random questions/answers generators
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
        int answer = 0;
        if (firstNum < secondNum) {
            temp = firstNum;
            firstNum = secondNum;
            secondNum = temp;
        }
        // we use Euclid's algorithm
        while (answer == 0) {
            int ost = firstNum % secondNum;
            if (firstNum % secondNum > 0) {
                System.out.println(firstNum + " " + secondNum + " " + ost);
                firstNum = secondNum;
                secondNum = ost;
            } else {
                answer = secondNum;
            }
        }



        return String.valueOf(answer);
    }
}
