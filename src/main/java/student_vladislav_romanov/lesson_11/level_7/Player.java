package student_vladislav_romanov.lesson_11.level_7;

public class Player {

    private String name;
    private ChipColor chipColor;
    private boolean isAi;

    public Player(String name, ChipColor chipColor, boolean isAi) {
        this.name = name;
        this.chipColor = chipColor;
        this.isAi = isAi;
    }

    public String getName() {
        return name;
    }

    public ChipColor getChipColor() {
        return chipColor;
    }

    public boolean isAi() {
        return isAi;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", chipColor=" + chipColor +
                ", isAi=" + isAi +
                '}';
    }
}
