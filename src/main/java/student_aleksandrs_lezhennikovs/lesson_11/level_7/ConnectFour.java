package student_aleksandrs_lezhennikovs.lesson_11.level_7;

import java.util.Random;
import java.util.Scanner;

public class ConnectFour {
    public static void main(String[] args) {
        int HEIGHT = 6;
        int WIDTH = 7;
        int steps = 0;
        Field field = new Field(WIDTH, HEIGHT);
        Token tokenX = new Token(Element.X);
        Token tokenO = new Token(Element.O);
        Scanner input = new Scanner(System.in);
        CheckVertical checkVerticalWin = new CheckVertical(field);
        CheckHorizontal checkHorizontal = new CheckHorizontal(field);
        //CheckWin check
        while (steps < HEIGHT * WIDTH) {
            steps++;
            field.printField();
            System.out.println("First player move:");
            int firstMove = input.nextInt();
            field.putToken(firstMove, tokenX);
            System.out.println("Win vertical counter: " + checkVerticalWin.verticalWin(firstMove, tokenX));
            System.out.println("Win horizontal counter: " + checkHorizontal.horizontalWin(firstMove, tokenX));

            System.out.println("Step Nr " + steps);
            field.printField();

            System.out.println("Second player move:");
            //Random random = new Random();
            //int secondMove = random.nextInt(5) + 1;
            int secondMove = input.nextInt();
            field.putToken(secondMove, tokenO);

            System.out.println("Win counter: " + checkVerticalWin.verticalWin(secondMove, tokenO));
            System.out.println("Win horizontal counter: " + checkHorizontal.horizontalWin(secondMove, tokenO));
            steps++;
            System.out.println("Step Nr " + steps);

        }
        field.printField();

    }


}
