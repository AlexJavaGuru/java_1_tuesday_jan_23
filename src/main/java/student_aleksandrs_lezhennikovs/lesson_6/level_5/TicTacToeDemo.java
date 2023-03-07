package student_aleksandrs_lezhennikovs.lesson_6.level_5;

import java.util.Scanner;

class TicTacToeDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input field size");

        TicTacToe game = new TicTacToe();
        game.setFieldSize(input.nextInt());
        game.play();
    }
}