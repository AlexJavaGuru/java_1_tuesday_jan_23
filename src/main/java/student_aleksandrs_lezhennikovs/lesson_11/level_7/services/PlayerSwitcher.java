package student_aleksandrs_lezhennikovs.lesson_11.level_7.services;

import student_aleksandrs_lezhennikovs.lesson_11.level_7.domens.Element;
import student_aleksandrs_lezhennikovs.lesson_11.level_7.domens.Token;

public class PlayerSwitcher {
    private Token token;

    public PlayerSwitcher(Token token) {
        this.token = token;
    }

    public Token changePlayer(Token tokenToSwitch) {
        Token tokenX = new Token(Element.X);
        Token tokenO = new Token(Element.O);
        if (tokenToSwitch.getElement().toString().equals("X")) {
            token = tokenO;
        } else {
            token = tokenX;
        }
        return token;
    }
}
