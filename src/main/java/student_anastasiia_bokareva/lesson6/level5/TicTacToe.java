package student_anastasiia_bokareva.lesson6.level5;

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
    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){
        boolean isWin = false;
        for (int x=0;x<3;x++){
            if (isWin==false){
            }
        }
    }

}
