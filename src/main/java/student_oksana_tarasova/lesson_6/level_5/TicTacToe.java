package student_oksana_tarasova.lesson_6.level_5;

import java.util.Scanner;

class TicTacToe {

    private TicTacToe ticTacToe;

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
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
        System.out.print("Enter the coordinates of your move: horizontal: ");
        System.out.println("vertical: ");
        Move move = new Move(scanner.nextInt(), scanner.nextInt());
        return move;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean lines;
        for (int i = 0; i < field.length; i++) {
            lines = true;
            for (int j = 0; j < field[i].length; j++) {
                lines &= (field[i][j] == playerToCheck);
            }
            if (lines) return true;
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean vertical;
        for (int i = 0; i < field.length; i++) {
            vertical = true;
            for (int j = 0; j < field[i].length; j++) {
                vertical &= (field[j][i] == playerToCheck);
            }
            if (vertical) return true;
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean right = true;
        boolean left = true;
        for (int i = 0; i < field.length; i++) {
            right &= (field[i][i] == playerToCheck);
            left &= (field[field.length - i - 1][i] == playerToCheck);
        }
        if (right || left) {
            return true;
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForDiagonals(field, playerToCheck);

    }

    public boolean isDrawPosition(int[][] field) {
        boolean emptyCell;
        emptyCell = true;
        for (int[] cellHorizontal : field) {
            for (int cellVertical : cellHorizontal) {
                emptyCell &= (cellVertical != -1);
            }
        }
        if (emptyCell) {
            return true;
        }
        return false;
    }

    public void play() {
        TicTacToe game = new TicTacToe();
        int[][] field = createField(3, 3);
        game.fillInTheField(field, -1);
        printFieldToConsole(field);
        while (true) {
            //printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            //printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}















/* применить при проверке диагоналей
String [][] chessBoard = new String[8][8];
        for (int i = 0; i< chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";
            }*/