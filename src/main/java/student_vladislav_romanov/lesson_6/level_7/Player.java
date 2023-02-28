package student_vladislav_romanov.lesson_6.level_7;

class Player {
    private final String name;
    private final char symbol;
    private final boolean isAI;

    public Player(String name, char symbol, boolean isAI) {
        this.name = name;
        this.symbol = symbol;
        this.isAI = isAI;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public boolean isAI() {
        return isAI;
    }
}
