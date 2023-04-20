package student_aleksandrs_lezhennikovs.lesson_11.level_7.ui;

import student_aleksandrs_lezhennikovs.lesson_11.level_7.domens.Token;

public class UsersMessages {
    public void nextMoveMessage() {
        System.out.println("Next move:");
    }

    public void winMessage(Token token) {
        System.out.println("Player " + token.getElement() + " Win!");
    }

    public void notValidMoveMessage() {
        System.out.println("Chose move between 1 and 7");
    }

    public void notValidColumnMessage() {
        System.out.println("Chose other column");
    }
}
