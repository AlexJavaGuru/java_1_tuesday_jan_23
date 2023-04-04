package student_aleksandrs_lezhennikovs.lesson_11.level_7;

public class PlayerSwitcher {
    private Token token;

    public PlayerSwitcher(Token token) {
        this.token = token;
    }

    public Token changePlayer(Token tokenToSwitch) {
        if (tokenToSwitch.getElement().toString().equals("X")) {
            token.setElement(Element.O);
        } else {
            token.setElement(Element.X);
        }
        return token;
    }
}
