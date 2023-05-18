package student_aleksandrs_lezhennikovs.lesson_15.level_3;

class Player {
    private  String name;
    private int points;

    public Player(String name) {
        this.name = name;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints() {
        this.points++;
    }
}
