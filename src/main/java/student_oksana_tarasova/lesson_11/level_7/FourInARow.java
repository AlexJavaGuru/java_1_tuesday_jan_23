package student_oksana_tarasova.lesson_11.level_7;

import java.util.Scanner;

class FourInARow {

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
        System.out.print("Enter the coordinates of your move: horizontal:");
        System.out.println("vertical: ");
        Move move = new Move(scanner.nextInt(), scanner.nextInt());
        return move;
    }

    public boolean isWinPosition(int[][] field, int playerTurn) {
        WinningPosition[] isWin = {
                new HorizontalVictory(),
                new VerticalVictory(),
                new RightDiagonalVictory(),
                new LeftDiagonalVictory()
        };
        WinningDetector winningDetector = new WinningDetector(isWin);
        return winningDetector.isWinPosition(field, playerTurn);
    }

    public boolean isDrawPosition(int[][] field) {
        boolean emptyCell;
        emptyCell = true;
        for (int[] cellHorizontal : field) {
            for (int cellVertical : cellHorizontal) {
                emptyCell &= (cellVertical != 0);
            }
        }
        if (emptyCell) {
            return true;
        }
        return false;
    }

    public void play() {
        FourInARow game = new FourInARow();
        int[][] field = createField(6, 7);
        game.fillInTheField(field, 0);
        printFieldToConsole(field);
        while (true) {
            Move move0 = getNextMove();
            field[move0.getHorizontalCoordinate()][move0.getVerticalCoordinate()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            Move move1 = getNextMove();
            field[move1.getHorizontalCoordinate()][move1.getVerticalCoordinate()] = 2;
            printFieldToConsole(field);
            if (isWinPosition(field, 2)) {
                System.out.println("Player 2 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
