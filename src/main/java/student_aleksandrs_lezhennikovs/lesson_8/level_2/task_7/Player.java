package student_aleksandrs_lezhennikovs.lesson_8.level_2.task_7;

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