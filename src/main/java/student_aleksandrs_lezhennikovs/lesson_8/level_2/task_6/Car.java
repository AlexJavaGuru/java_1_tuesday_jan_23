package student_aleksandrs_lezhennikovs.lesson_8.level_2.task_6;

class Car {

    private int releaseYear;

    public Car(int releaseYear) {
        this.releaseYear = releaseYear;
    }

}

class Porsche911 extends Car {

    private int topSpeed;

    Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;

    }

}

class Porsche911Demo {

    public static void main(String[] args) {
        Porsche911 porsche911 = new Porsche911(2023, 330);
    }

}