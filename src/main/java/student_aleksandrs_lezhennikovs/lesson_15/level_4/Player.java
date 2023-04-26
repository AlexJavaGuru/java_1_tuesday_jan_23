package student_aleksandrs_lezhennikovs.lesson_15.level_4;

class Player {
    private String name;
    private String result;
    private int points;

    public Player(String name) {
        this.name = name;
        this.result = "";
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
