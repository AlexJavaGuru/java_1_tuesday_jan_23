package student_anastasiia_bokareva.lesson6.level5;

import java.util.Scanner;

public class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
         boolean isWin = false;
         for (int x=0; x<3;x++){
             if (isWin==false){
                 if ((field[x][1]==field[x][2])&&(field[x][0]==playerToCheck)&&(playerToCheck==field[x][1])){
                         isWin=true;
                     }
                 }
             }
         return isWin;
    }
    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
        boolean isWin = false;
        for (int y=0; y<3;y++){
            if (isWin==false){
                if ((field[0][y]==field[1][y])&&(field[2][y]==playerToCheck)&&(playerToCheck==field[1][y])){
                    isWin=true;
                }
            }
        }
        return isWin;
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
    public boolean isWinPosition(int[][] field, int playerToCheck){
        return isWinPositionForVerticals(field,playerToCheck)||isWinPositionForHorizontals(field,playerToCheck)||isWinPositionForDiagonalsRighttoLeft(field,playerToCheck)||isWinPositionForDiagonalsLeftToRight(field,playerToCheck);
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
