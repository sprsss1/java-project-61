package hexlet.code;

import static hexlet.code.Engine.welcome;
import static hexlet.code.Engine.randomIntGenerator;
import static hexlet.code.Engine.mainEngine;


public class Progression {
    public static void progressionGame() {
        String userName = welcome();
        String gameTask = "What number is missing in the progression?";
        String[] rightAnswer = new String[3];
        String[] question = new String[3];
        int questionCount = 3;

        for (var i = 0; i < questionCount; i++) {
            int[] firsPartQuestion = firstPartOfQuestionGenerator();
            int indexOfRightAnswer = randomIntGenerator(0, firsPartQuestion.length - 1);
            rightAnswer[i] = String.valueOf(firsPartQuestion[indexOfRightAnswer]);
            question[i] = secondPartOfQuestionGenerator(firsPartQuestion, indexOfRightAnswer);
        }

        mainEngine(gameTask, question, rightAnswer, userName);
    }
    //all games using random questions/answers generators
    //first part return full numbers array
    //second part return String array with hidden element
    public static int[] firstPartOfQuestionGenerator() {
        int firstElement = randomIntGenerator(1, 50);
        int stepProgression = randomIntGenerator(1, 10);
        int numbersOfElements = randomIntGenerator(5, 12);
        int[] fullString = new int[numbersOfElements];
        for (var i = 0; i < numbersOfElements; i++) {
            fullString[i] = firstElement + stepProgression * i;

        }
        return fullString;
    }
    public static String secondPartOfQuestionGenerator(int[] arr, int hide) {
        StringBuilder quest = new StringBuilder();
        int arrayLength = arr.length;
        for (var i = 0; i < arrayLength; i++) {
            if (i != hide & i != arrayLength - 1) {
                quest.append(arr[i]);
                quest.append(" ");
            } else if (i == hide & i != arrayLength - 1) {
                quest.append("..");
                quest.append(" ");
            } else if (i == hide & i == arrayLength - 1) {
                quest.append("..");
            } else {
                quest.append(arr[i]);
            }
        }
        return quest.toString();
    }

}
