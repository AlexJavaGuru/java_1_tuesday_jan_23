package student_oksana_tarasova.lesson_6.level_5;

class TicTacToe {


    public int[][] createField(int countOfLines, int countOfColumns) {
        int[][] field = new int[countOfLines][countOfColumns];
        return new int[countOfLines][countOfColumns];
    }

    public int[][] fillInTheField(int[][] field, int symbolCell) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++ ) {
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


    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != playerToCheck) {
                    break;
                }
            }
        }
        return true;
    }
}


/* применить при проверке диагоналей
String [][] chessBoard = new String[8][8];
        for (int i = 0; i< chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";
            }*/