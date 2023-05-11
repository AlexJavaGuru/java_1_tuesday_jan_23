package student_dmitry_kupcus.lesson_8.level_2;

class Player {

    private String name;

    @Override
    public String toString() {
        return "Name is: " + name;
    }

    Player(String name) {
        this.name = name;
    }

}

class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super(name);
    }
}

class ComputerPlayer extends Player {

    ComputerPlayer(String name) {
        super(name);
    }
}


