package student_anastasiia_bokareva.lesson6.level5;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        int[][]field= new int[3][3];
        field[0][0]=0;
        field[0][1]=0;
        field[0][2]=1;
        field[1][0]=1;
        field[1][1]=0;
        field[1][2]=0;
        field[2][0]=0;
        field[2][1]=1;
        field[2][2]=0;
        TicTacToe toe = new TicTacToe();
        boolean isWin = toe.isDrawPosition(field);
        if (isWin==true){
            System.out.println("Iswin");
        }


    }
}
