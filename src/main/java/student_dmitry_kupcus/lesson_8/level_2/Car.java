package student_dmitry_kupcus.lesson_8.level_2;

class Car {

    private int releaseYear;
    private int topSpeed;

    public Car(int releaseYear, int topSpeed) {
        this.releaseYear = releaseYear;
        this.topSpeed = topSpeed;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}

class Porsche911 extends Car {
    Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear, topSpeed);

    }
}

class Porsche911Demo {

    public static void main(String[] args) {
        Car porsche = new Car(2000, 250);
        System.out.println("Release year: " + porsche.getReleaseYear());
        System.out.println("Top speed: " + porsche.getTopSpeed());
    }

}
