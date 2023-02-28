package student_aleksandrs_lezhennikovs.lesson_5.extra;

import java.util.Scanner;

class TicTacToe {

    public int[][] createField(int fieldSize) {

        int[][] field = new int[fieldSize][fieldSize];
        for (int rows = 0; rows < fieldSize; rows++) {
            for (int columns = 0; columns < fieldSize; columns++){
                field[rows][columns] = -1;
            }
        }
        return field;
    }

    public void printFieldToConsole(int[][] field) {

        for (int rows = 0; rows < field.length; rows++) {
            for (int columns = 0; columns < field.length; columns++) {
                if (columns == field.length - 1) {
                    if (field[rows][columns] != -1){
                        System.out.println(" " + field[rows][columns]);
                    } else {
                        System.out.println(field[rows][columns]);
                    }
                } else {
                    if (field[rows][columns] != -1) {
                        System.out.print(" " + field[rows][columns] + "|");
                    } else {
                        System.out.print(field[rows][columns] + "|");
                    }
                }
            }
        }
        System.out.println("");
    }


    public boolean isWinPositionInOneRow(int[][] field, int playerToCheck, int row) {

        int fieldSize = field.length;
        for (int column = 0; column < fieldSize; column++) {
                if (playerToCheck != field[row][column]) {
                    return false;
                }
            }
        return true;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

        int fieldSize = field.length;
        for (int rows = 0; rows < fieldSize; rows++) {
            if(isWinPositionInOneRow(field, playerToCheck, rows)) {
                return true;
            }
        }
        return false;
        }

    public boolean isWinPositionInOneColumn(int[][] field, int playerToCheck, int column) {

        int fieldSize = field.length;
        for (int row = 0; row < fieldSize; row++) {
            if (playerToCheck != field[row][column]) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {

        for (int column = 0; column < field.length; column++) {
            if (isWinPositionInOneColumn(field, playerToCheck, column)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {

        return firstDiagonal(field, playerToCheck) || secondDiagonal(field, playerToCheck);
    }

    public boolean firstDiagonal(int[][] field, int playerToCheck) {

        for (int cell = 0; cell < field.length; cell++) {
            if (playerToCheck != field[cell][cell]) {
                return false;
            }
        }
        return true;
    }

    public boolean secondDiagonal(int[][] field, int playerToCheck) {

        int fromEnd = field.length - 1;
        for (int fromStart = 0; fromStart < field.length; fromStart++) {
            if (playerToCheck != field[fromStart][fromEnd]) {
                return false;
            }
            fromEnd--;
        }
        return true;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {

        boolean isHorizontalWin = isWinPositionForHorizontals(field, playerToCheck);
        boolean isVerticalWin = isWinPositionForVerticals(field, playerToCheck);
        boolean isDiagonalsWin = isWinPositionForDiagonals(field, playerToCheck);

        return isHorizontalWin || isVerticalWin || isDiagonalsWin;
    }

    public boolean isDrawPosition(int[][] field) {

        int check = 0;

        for (int rows = 0; rows < field.length; rows++) {
            for (int columns = 0; columns < field.length; columns++) {
                if (field[rows][columns] == -1) {
                    check++;
                }
            }
        }
        return (check == 0);
    }

    public void play(int fieldSize) {

        int[][] field = createField(fieldSize);
        int playerCheck = 0;

        PlayerSwitcher playerSwitcher = new PlayerSwitcher(playerCheck);
        boolean isWin = isWinPosition(field, playerCheck);
        boolean isDraw = isDrawPosition(field);
        boolean isContinue = !(isWin || isDraw);

        printFieldToConsole(field);

        while(isContinue) {

            nextMove(field, playerCheck);
            isWin = isWinPosition(field, playerCheck);
            isDraw = isDrawPosition(field);
            isContinue = !(isWin || isDraw);

            if (isWin) {
                System.out.println("Player " + playerCheck + " WIN!");
            } else if (isDraw) {
                printFieldToConsole(field);
                System.out.println("DRAW!");
            }
            playerCheck = playerSwitcher.changePlayer(playerCheck);
        }
    }

    public Move getNextMove() {

        Scanner input = new Scanner(System.in);
        System.out.println("Input new coordinates please");
        int x = input.nextInt();
        int y = input.nextInt();

        Move move = new Move(x, y);

        return move;
    }

    public void nextMove(int[][] field, int playerToCheck) {

        Move move = getNextMove();
        if(isInFieldRange(field, move.getX(), move.getY())) {
            int checkCell = field[move.getX()][move.getY()];

            if (isCellEmpty(checkCell)) {
                field[move.getX()][move.getY()] = playerToCheck;
                printFieldToConsole(field);
            } else {
                System.out.println("Cell is busy");
                printFieldToConsole(field);
                nextMove(field, playerToCheck);
            }

        } else {
            System.out.println("Cell is out of Field range");
            printFieldToConsole(field);
            nextMove(field, playerToCheck);
        }
    }

    private static boolean isCellEmpty(int cell) {
        return (cell == -1);
    }

    private static boolean isInFieldRange(int[][] field, int x, int y) {
        return (x >= 0 && x < field.length && y >= 0 && y < field.length);
    }
}
