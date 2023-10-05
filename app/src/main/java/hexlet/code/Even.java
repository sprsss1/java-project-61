package hexlet.code;

import static hexlet.code.Engine.welcome;
import static hexlet.code.Engine.randomIntGenerator;
import static hexlet.code.Engine.mainEngine;
import static java.lang.Integer.parseInt;

public class Even {
    public static void evenGame() {
        String userName = welcome();
        String gameTask = "Answer 'yes' if the number is even, otherwise answer 'no'.";
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
        return String.valueOf(fNumber);
    }
    public static String answerGenerator(String string) {
        int value = parseInt(string);
        String answ = "yes";
        if ((value % 2) != 0) {
            answ = "no";
        }
        return answ;
    }
}
