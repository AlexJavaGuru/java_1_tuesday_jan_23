package student_ilya_tihonov.lesson_8.level_3.task_13;

public class IPhone extends  ButtonPhone {

    boolean touchScreen;

    public IPhone(String brand, int releaseYear, String model, boolean touchScreen) {
        super(brand, releaseYear, model);
        this.touchScreen = touchScreen;
    }

    public void shootVideo() {
        System.out.println("The camera started filming");
    }

    public void sendAMessage() {
        System.out.println("The message was delivered");
    }
}
