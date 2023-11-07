package hexlet.code;

import static hexlet.code.Engine.welcome;
import static hexlet.code.Engine.randomIntGenerator;
import static hexlet.code.Engine.mainEngine;


public class Progression {
    public static void progressionGame() {
        String userName = welcome();
        String gameTask = "What number is missing in the progression?";
        int questionCount = 3;
        String[] rightAnswer = new String[questionCount];
        String[] question = new String[questionCount];
        for (var i = 0; i < questionCount; i++) {
            int[] firsPartQuestion = firstPartOfQuestionGenerator();
            int minInt = 0;
            int indexOfRightAnswer = randomIntGenerator(minInt, firsPartQuestion.length - 1);
            rightAnswer[i] = String.valueOf(firsPartQuestion[indexOfRightAnswer]);
            question[i] = secondPartOfQuestionGenerator(firsPartQuestion, indexOfRightAnswer);
        }

        mainEngine(gameTask, question, rightAnswer, userName);
    }
    //all games using random questions/answers generators
    //first part return full numbers array
    //second part return String array with hidden element
    public static int[] firstPartOfQuestionGenerator() {
        int minValue = 1;
        int maxValue = 50;
        int firstElement = randomIntGenerator(minValue, maxValue);
        int stepProgression = randomIntGenerator(minValue, maxValue);
        int minNumberOfElement = 5;
        int maxNumberOfElement = 12;
        int numbersOfElements = randomIntGenerator(minNumberOfElement, maxNumberOfElement);
        int[] fullString = new int[numbersOfElements];
        for (var i = 0; i < numbersOfElements; i++) {
            fullString[i] = firstElement + stepProgression * i;

        }
        return fullString;
    }
    public static String secondPartOfQuestionGenerator(int[] arr, int hide) {
        StringBuilder quest = new StringBuilder();
        int arrayLength = arr.length;
        String prefix = "";
        for (var i = 0; i < arrayLength; i++) {
            //if (i != hide & i != arrayLength - 1) {
             //   quest.append(arr[i]);
            //    quest.append(" ");
            //} else if (i == hide & i != arrayLength - 1) {
            //    quest.append("..");
            //    quest.append(" ");
            if (i == hide & i != arrayLength - 1) {
                quest.append(" ");
                quest.append("..");
                    //quest.append(" ");
            } else if (i == hide & i == arrayLength - 1) {
                quest.append("..");
            } else {
                quest.append(prefix);
                prefix = " ";
                quest.append(arr[i]);
            }
        }
        return quest.toString();
    }

}
