package student_romualds_leitans.lesson_8.level_2;

class Car {

    private int releaseYear;

    public Car(int releaseYear) {
        this.releaseYear = releaseYear;
    }

}

class Porsche911 extends Car {

    private int topSpeed;

    public Porsche911(int topSpeed, int releaseYear) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }


}
