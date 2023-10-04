package hexlet.code;


import static hexlet.code.Engine.*;

public class Even {
    public static void evenGame() {
        String userName = welcome();
        String gameTask = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        mainEngine(gameTask,userName);
    }
}
