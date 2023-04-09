package student_andrejs_cekalins.lesson_8.level_2.Task_8;

class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }
}
class ComputerPlayer extends Player {
    ComputerPlayer(String name){
        super(name);
    }

}
class ComputerPlayerDemo {
    ComputerPlayer computerPlayer = new ComputerPlayer("Andrej");
}