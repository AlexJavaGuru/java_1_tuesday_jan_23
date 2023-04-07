package student_aleksandrs_lezhennikovs.lesson_11.level_7;

import java.util.Random;
import java.util.Scanner;

public class ConnectFour {
    public static void main(String[] args) {
        int HEIGHT = 6;
        int WIDTH = 7;
        int steps = 0;
        Field field = new Field(WIDTH, HEIGHT);
        Element elementX = Element.X;
        Element elementO  = Element.O;
        Scanner input = new Scanner(System.in);
        CheckVertical checkVerticalWin = new CheckVertical(field);
        CheckHorizontal checkHorizontal = new CheckHorizontal(field);
        CheckDiagonals checkDiagonals = new CheckDiagonals(field);

        //CheckWin check
        while (steps < HEIGHT * WIDTH) {
            steps++;
            field.printField();
            System.out.println("First player move:");
            int firstMove = input.nextInt();
            Token tokenX = new Token(Element.X);
            field.putToken(firstMove, tokenX);
            field.printField();
            //if (steps > 6) {
                System.out.println("Win vertical counter: " + checkVerticalWin.verticalWin(firstMove, tokenX));
                System.out.println("Win horizontal counter: " + checkHorizontal.horizontalWin(firstMove, tokenX));
                Coord newCoord = new Coord(firstMove, field.getCols().get(firstMove - 1).getTokenList().size());
                int chX = newCoord.getX();
                int chY = newCoord.getY();
                System.out.println("Win diagonal counter: " + checkDiagonals.diagonalsWin(newCoord, tokenX));
            //}
            System.out.println("Step Nr " + steps);
            System.out.println("Second player move:");
            int secondMove = input.nextInt();
            Token tokenO = new Token(Element.O);
            field.putToken(secondMove, tokenO);
            field.printField();
            //if (steps > 6) {
                System.out.println("Win vertical counter: " + checkVerticalWin.verticalWin(secondMove, tokenO));
                System.out.println("Win horizontal counter: " + checkHorizontal.horizontalWin(secondMove, tokenO));
           //}
            steps++;
            System.out.println("Step Nr " + steps);
        }
        field.printField();
    }
}
