package student_vladislav_romanov.lesson_11.level_7;

public class Player {

    private String name;
    private int chip;
    private boolean isAi;

    public Player(String name, int chip, boolean isAi) {
        this.name = name;
        this.chip = chip;
        this.isAi = isAi;
    }

    public String getName() {
        return name;
    }

    public int getChip() {
        return chip;
    }

    public boolean isAi() {
        return isAi;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", chipColor=" + chip +
                ", isAi=" + isAi +
                '}';
    }
}
