package hexlet.code;


import static hexlet.code.Engine.*;

public class Even {
    public static void evenGame() {
        String userName = welcome();
        String gameTask = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int questNumber = randomIntGenerator();

        String rightAnswer = "yes";

        if ((questNumber % 2) != 0) {
            rightAnswer = "no";
        }
        String question = String.valueOf(questNumber);

        mainEngine(gameTask, question, rightAnswer, userName);
    }
}
