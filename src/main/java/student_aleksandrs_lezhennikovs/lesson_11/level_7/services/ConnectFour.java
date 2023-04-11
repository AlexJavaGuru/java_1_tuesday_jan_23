package student_aleksandrs_lezhennikovs.lesson_11.level_7.services;

import student_aleksandrs_lezhennikovs.lesson_11.level_7.domens.Element;
import student_aleksandrs_lezhennikovs.lesson_11.level_7.domens.Field;
import student_aleksandrs_lezhennikovs.lesson_11.level_7.domens.Token;
import student_aleksandrs_lezhennikovs.lesson_11.level_7.ui.UsersMessages;

import java.util.Scanner;

public class ConnectFour {
    private Field field;

    public ConnectFour(int width, int height, int winCount) {
        this.field = new Field(width, height, winCount);
    }

    public void play() {
        UsersMessages usersMessages = new UsersMessages();
        Token token = new Token(Element.X);
        PlayerSwitcher playerSwitcher = new PlayerSwitcher(token);
        field.printFieldToConsole();
        int move = requestNextMove();
        while (!validateInRange(move)) {
            usersMessages.notValidMoveMessage();
            move = requestNextMove();
        }
        field.isTokenDropped(move, token);
        boolean isContinue = isEmptyCell() && !isWin(token);
        field.printFieldToConsole();

        while (isContinue) {
            token = playerSwitcher.changePlayer(token);
            move = requestNextMove();
            while (!validateInRange(move)) {
                usersMessages.notValidMoveMessage();
                move = requestNextMove();
            }
            if (field.isTokenDropped(move, token)) {
                isContinue = isEmptyCell() && !isWin(token);
                field.printFieldToConsole();
            } else {
                usersMessages.notValidColumnMessage();
            }
        }
        field.printFieldToConsole();
        usersMessages.winMessage(token);
    }

    public boolean validateInRange(int nextMove) {
        return nextMove > 0 && nextMove <= field.getWith();
    }

    public static int requestNextMove() {
        UsersMessages usersMessages = new UsersMessages();
        Scanner input = new Scanner(System.in);
        usersMessages.nextMoveMessage();
        return input.nextInt();
    }

    private boolean isWin(Token token) {
        CheckWin checkWin = new CheckWin();
        return checkWin.checkAll(field, token);
    }

    private boolean isEmptyCell() {
        return field.getEmptyCells() > 0;
    }


}