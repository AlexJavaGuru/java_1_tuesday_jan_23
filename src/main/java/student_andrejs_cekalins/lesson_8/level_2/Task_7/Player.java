package student_andrejs_cekalins.lesson_8.level_2.Task_7;

class Player {
    private String name;
    Player(String name) {
        this.name = name;
    }
}
class HumanPlayer extends Player {
    HumanPlayer(String name) {
        super(name);

    }
}