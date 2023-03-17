package student_anastasiia_bokareva.lesson6.level5;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinForHorizontal();
        test.isWinForVertical();
        test.isWinForDiagonalsRightToLeft();
        test.isWinForDiagonalsLeftToRight();
        test.winPosition();
        test.printEmptyField();


    }
    public void isWinForHorizontal(){
        TicTacToe toe = new TicTacToe();
        int[][]field= new int[3][3];
        field[0][0]=1;
        field[0][1]=1;
        field[0][2]=1;
        field[1][0]=-1;
        field[1][1]=-1;
        field[1][2]=-1;
        field[2][0]=-1;
        field[2][1]=-1;
        field[2][2]=-1;
        boolean realResult = toe.isWinPositionForHorizontals(field,1);
        boolean expectedResult = true;
        checkResultInt(realResult,expectedResult,"is win for horizontal");
    }
    public void isWinForVertical(){
        TicTacToe toe = new TicTacToe();
        int[][]field= new int[3][3];
        field[0][0]=1;
        field[0][1]=-1;
        field[0][2]=-1;
        field[1][0]=1;
        field[1][1]=-1;
        field[1][2]=-1;
        field[2][0]=1;
        field[2][1]=-1;
        field[2][2]=-1;
        boolean realResult = toe.isWinPositionForVerticals(field,1);
        boolean expectedResult = true;
        checkResultInt(realResult,expectedResult,"is win for vertical");
    }
    public void isWinForDiagonalsRightToLeft(){
        TicTacToe toe = new TicTacToe();
        int[][]field= new int[3][3];
        field[0][0]=1;
        field[0][1]=-1;
        field[0][2]=-1;
        field[1][0]=-1;
        field[1][1]=1;
        field[1][2]=-1;
        field[2][0]=-1;
        field[2][1]=-1;
        field[2][2]=1;
        boolean realResult = toe.isWinPositionForDiagonalsRighttoLeft(field,1);
        boolean expectedResult = true;
        checkResultInt(realResult,expectedResult,"is win for diagonal right to left");
    }
    public void isWinForDiagonalsLeftToRight(){
        TicTacToe toe = new TicTacToe();
        int[][]field= new int[3][3];
        field[0][0]=-1;
        field[0][1]=-1;
        field[0][2]=1;
        field[1][0]=-1;
        field[1][1]=1;
        field[1][2]=-1;
        field[2][0]=1;
        field[2][1]=-1;
        field[2][2]=-1;
        boolean realResult = toe.isWinPositionForDiagonalsLeftToRight(field,1);
        boolean expectedResult = true;
        checkResultInt(realResult,expectedResult,"is win for diagonal left to right ");
    }
    public void winPosition(){
        TicTacToe toe = new TicTacToe();
        int[][]field= new int[3][3];
        field[0][0]=0;
        field[0][1]=0;
        field[0][2]=0;
        field[1][0]=1;
        field[1][1]=1;
        field[1][2]=1;
        field[2][0]=0;
        field[2][1]=0;
        field[2][2]=0;
        boolean realResult = toe.isWinPosition(field,1);
        boolean expectedResult = true;
        checkResultInt(realResult,expectedResult,"is win position");
    }
    public void isDrawPosition(){
        TicTacToe toe = new TicTacToe();
        int[][]field= new int[3][3];
        field[0][0]=0;
        field[0][1]=0;
        field[0][2]=0;
        field[1][0]=1;
        field[1][1]=1;
        field[1][2]=1;
        field[2][0]=0;
        field[2][1]=0;
        field[2][2]=0;
        boolean realResult = toe.isDrawPosition(field);
        boolean expectedResult = true;
        checkResultInt(realResult,expectedResult,"is draw position ");
    }
    public void printEmptyField() {
        TicTacToe toe = new TicTacToe();
        int[][] gameField = toe.createField();
        toe.printFieldToConsole(gameField);
    }


    public void checkResultInt (boolean expectedResult, boolean realResult, String nameTest){
        if (expectedResult==realResult){
            System.out.println("Test "+nameTest+" ok");
        } else {
            System.out.println("Test "+ nameTest + " fail");
        }
    }

}
