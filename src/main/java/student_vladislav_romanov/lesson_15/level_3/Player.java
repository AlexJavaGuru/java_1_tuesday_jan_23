package student_vladislav_romanov.lesson_15.level_3;

class Player {

    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getScoreName() {
        return switch (score) {
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            case 3 -> "Forty";
            default -> "Love";
        };
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updateScore() {
        score++;
    }
}
