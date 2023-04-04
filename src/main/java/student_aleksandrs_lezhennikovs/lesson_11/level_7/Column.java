package student_aleksandrs_lezhennikovs.lesson_11.level_7;

import java.util.ArrayList;
import java.util.List;

public class Column {
    private List<Token> tokenList;

    public Column() {
        this.tokenList = new ArrayList<>();
    }


    public List<Token> getTokenList() {
        return tokenList;
    }

    public void setTokenList(Token token) {
        this.tokenList.add(token);
    }

    @Override
    public String toString() {
        return "" + tokenList + "";
    }
}
