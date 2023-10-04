package hexlet.code;


import static hexlet.code.Engine.mainEngine;
import static hexlet.code.Engine.welcome;

public class Even {
    public static void evenGame() {
        String userName = welcome();
        String gameTask = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        mainEngine(gameTask, userName);
    }
}
