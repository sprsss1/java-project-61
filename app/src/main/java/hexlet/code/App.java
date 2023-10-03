package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println( "Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name? ");
        var name = sc.next();
        System.out.println("Hello, " + name + "!");

    }
}
