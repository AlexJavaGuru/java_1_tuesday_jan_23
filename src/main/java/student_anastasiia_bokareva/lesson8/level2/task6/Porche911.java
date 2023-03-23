package student_anastasiia_bokareva.lesson8.level2.task6;

class Car {
    private int releaseYear;

    public Car(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}

class Porsche911 extends Car {

    private int topSpeed;

    Porsche911 (int releaseYear, int maxSpeed){
        super(releaseYear);
        this.topSpeed=maxSpeed;
    }
}

class Porsche911Demo {

    public static void main(String[] args) {
        Porsche911 porsche911 = new Porsche911(1993, 200);
    }
}
