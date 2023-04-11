package student_aleksandrs_lezhennikovs.lesson_11.level_7.ui;

import java.util.Scanner;

public class UserInterface {

    private int width;
    private int height;
    private int winCount;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWinCount() {
        return winCount;
    }

    public void requestGameSetUp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input field width");
        this.width = input.nextInt();
        System.out.println("Input field height");
        this.height = input.nextInt();
        System.out.println("Input win count");
        this.winCount = input.nextInt();

    }


}
