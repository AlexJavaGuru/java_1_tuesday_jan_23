package student_oksana_tarasova.lesson_8.level_2;

class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
