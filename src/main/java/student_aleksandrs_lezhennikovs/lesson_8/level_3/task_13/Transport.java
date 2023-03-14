package student_aleksandrs_lezhennikovs.lesson_8.level_3.task_13;

abstract class Transport {

    void move() {

    }
}

class AirTransport extends Transport {

    @Override
    public void move() {
        System.out.println("Fly");
    }

}

class MaritimeTransport extends Transport {

    @Override
    public void move() {
        System.out.println("Goes by sea");
    }
}
