package student_ilya_tihonov.lesson_8.level_3.task_13;

abstract class Nokia3310 {

    String brand;
    int releaseYear ;
    String model;

    public Nokia3310(String brand, int releaseYear, String model) {
        this.brand = brand;
        this.releaseYear = releaseYear;
        this.model = model;
    }

    public abstract void shootVideo();

    public abstract void sendAMessage();


}
