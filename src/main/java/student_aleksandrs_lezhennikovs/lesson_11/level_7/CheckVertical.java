package student_aleksandrs_lezhennikovs.lesson_11.level_7;

public class CheckVertical {
    private Field field;

    public CheckVertical(Field field) {
        this.field = field;
    }

    public boolean verticalWin(int column, Token token) {
        return countEqualToken(column, token) == 4;
    }

    public int countEqualToken(int column, Token token) {
        int counter = 1;
        int checkSize = field.getCols().get(column - 1).getTokenList().size();
        if (field.getCols().get(column - 1).getTokenList().size() > 3) {
            int size = field.getCols().get(column - 1).getTokenList().size();
            for (int i = size - 1; i > size - 4; i--) {
                Element element = field.getCols().get(column - 1).getTokenList().get(i - 1).getElement();
                if (element.equals(token.getElement())) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
