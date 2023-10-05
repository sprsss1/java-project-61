package hexlet.code;

import static hexlet.code.Engine.welcome;
import static hexlet.code.Engine.randomIntGenerator;
import static hexlet.code.Engine.mainEngine;
import static java.lang.Integer.parseInt;

public class Prime {
    public static void primeGame() {
        String userName = welcome();
        String gameTask = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int[] primeNumberArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79};
        String[] question = new String[3];
        String[] rightAnswer = new String[3];
        int questionCount = 3;
        for (var i = 0; i < questionCount; i++) {
            question[i] = questionGenerator();
            rightAnswer[i] = answerGenerator(question[i], primeNumberArray);
        }

        mainEngine(gameTask, question, rightAnswer, userName);
    }
    //all games using random questions/answers generators
    public static String questionGenerator() {
        int quest = randomIntGenerator(0, 80);
        return String.valueOf(quest);
    }
    public static String answerGenerator(String string, int[] array) {
        int value = parseInt(string);
        String answ = "no";
        for (int num : array) {
            if (value == num) {
                answ = "yes";
                break;
            }
        }
        return answ;
    }
}
