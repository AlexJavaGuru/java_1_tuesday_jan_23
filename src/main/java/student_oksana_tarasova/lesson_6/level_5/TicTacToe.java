package student_oksana_tarasova.lesson_6.level_5;

import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {
        Move move = new Move(2, 2);


    }


    public int[][] createField(int countOfLines, int countOfColumns) {
        int[][] field = new int[countOfLines][countOfColumns];
        return new int[countOfLines][countOfColumns];
    }

    public int[][] fillInTheField(int[][] field, int symbolCell) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = symbolCell;
            }
        }
        return field;
    }


    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Еnter the coordinates of your move: horizontal: ");
        System.out.println("vertical: ");
        Move move = new Move(scanner.nextInt(), scanner.nextInt());
        return move;
    }
/*
    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWin(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move mo ve1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWin(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

*/


    public void isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length - 1; j++) {
                if (field[i][j] == playerToCheck) {
                    if (field[i][j] == field[i][j + 1]) {
                    }
                } else if (field[i][j] != playerToCheck) {
                    System.out.println("no");
                    break;
                }
            }

        }
        System.out.println("yes");
    }
}





/* применить при проверке диагоналей
String [][] chessBoard = new String[8][8];
        for (int i = 0; i< chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";
            }*/