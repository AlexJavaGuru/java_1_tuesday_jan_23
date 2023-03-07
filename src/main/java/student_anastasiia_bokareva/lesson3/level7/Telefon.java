package student_anastasiia_bokareva.lesson3.level7;

public class Telefon {

    String model;

    Integer myNumber;

    Telefon(String model, int myNumber) {
        this.model = model;
        this.myNumber= myNumber;
    }

    public void call() {
        System.out.println("piiip-piiip-piiip");
    }
    public void sendMessage() {
        System.out.print("You choose your friend, please write the message -");
    }



}
