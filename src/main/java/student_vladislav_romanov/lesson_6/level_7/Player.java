package student_vladislav_romanov.lesson_6.level_7;

class Player {
    private final char symbol;
    private final boolean isAI;

    public Player(char symbol, boolean isAI) {
        this.symbol = symbol;
        this.isAI = isAI;
    }

    public char getSymbol() {
        return symbol;
    }

    public boolean isAI() {
        return isAI;
    }
}
