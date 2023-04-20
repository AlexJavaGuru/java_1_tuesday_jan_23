package student_aleksandrs_lezhennikovs.lesson_11.level_7;

import student_aleksandrs_lezhennikovs.lesson_11.level_7.services.ConnectFour;
import student_aleksandrs_lezhennikovs.lesson_11.level_7.ui.UserInterface;

public class ConnectFourDemo {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        userInterface.requestGameSetUp();
        ConnectFour game = new ConnectFour(userInterface.getWidth(), userInterface.getHeight(), userInterface.getWinCount());
        game.play();
    }
}
