package student_anastasiia_bokareva.lesson8.level2.task8;

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

class  ComputerPlayerDemo {
    public static void main(String[] args) {
        ComputerPlayer player = new ComputerPlayer("Stiv");
    }
}