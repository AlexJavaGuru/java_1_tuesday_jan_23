package student_anastasiia_bokareva.lesson6.level5;

import java.util.Scanner;

public class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int x = 0; x < 3; x++) {
            if ((field[x][1] == field[x][2]) && (field[x][0] == playerToCheck)) {
                if (playerToCheck == field[x][1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int x = 0; x < 3; x++) {
            if ((field[0][x] == field[1][x]) && (field[2][x] == playerToCheck)) {
                if (playerToCheck == field[1][x]){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isWinPositionForDiagonalsRighttoLeft(int[][] field, int playerToCheck){
        for (int x=0;x<field.length;x++){
            if (field[x][x]!= playerToCheck){
                return false;
            }
        }
        return true;
    }
    public boolean isWinPositionForDiagonalsLeftToRight(int[][] field, int playerToCheck){
        for (int x= 2 ; x>=0;x--){
            if (field[2-x][x]!= playerToCheck){
                return false;
            }
        }
        return true;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        boolean check = isWinPositionForVerticals(field, playerToCheck) || isWinPositionForHorizontals(field, playerToCheck);
        check = check || isWinPositionForDiagonalsRighttoLeft(field, playerToCheck);
        check = check || isWinPositionForDiagonalsLeftToRight(field, playerToCheck);
        return check;
    }
    public boolean isDrawPosition(int[][] field){
        int empty = -1;
        for (int x=0;x<field.length;x++){
            for (int y=0; y< field.length;y++){
                if (field[x][y]==empty){
                    return false;
                }
            }
        }
        return true;
    }
    public int[][] createField(){
        int[][] gameField = new int[3][3];
        for (int x=0;x<3;x++){
            for (int y=0;y<3;y++){
                gameField[x][y]=-1;
            }
        }
        return gameField;
    }
    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Set coordinate vertical ");
        int x = scanner.nextInt();
        System.out.print("Set coordinates horizontal ");
        int y = scanner.nextInt();
        return new Move(x, y);
    }
    public void printFieldToConsole(int[][] field) {
        for (int x = 0; x<field.length;x++){
            for (int y=0;y<field.length;y++){
                System.out.print(" | "+field[x][y]);
            }
            System.out.print(" | ");
            System.out.println(" ");
        }
    }

}
