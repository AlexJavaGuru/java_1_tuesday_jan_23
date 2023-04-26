package student_daniels_belejuns.lesson_8.level_2.task_8;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class ComputerPlayer extends Player {
    ComputerPlayer(String name) {
        super(name);
    }
}
