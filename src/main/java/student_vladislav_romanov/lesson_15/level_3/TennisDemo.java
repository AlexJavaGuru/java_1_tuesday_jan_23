package student_vladislav_romanov.lesson_15.level_3;

import java.util.Scanner;

public class TennisDemo {

    public static void main(String[] args) {

        TennisGame tennis = new Tennis("Player1", "Player2");
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Set get player (1 or 2): ");
            int player = scanner.nextInt();
            if (player == 1) {
                tennis.wonPoint("Player1");
            } else {
                tennis.wonPoint("Player2");
            }
            System.out.println(tennis.score());
        }

    }

}
