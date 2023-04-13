package student_ilya_tihonov.lesson_8.level_3.task_13;

public class IPhone extends  Nokia3310 {

    boolean touchScreen;

    public IPhone(String brand, int releaseYear, String model, boolean touchScreen) {
        super(brand, releaseYear, model);
        this.touchScreen = touchScreen;
    }

    @Override
    public void shootVideo() {
        System.out.println("The camera started filming");
    }

    @Override
    public void sendAMessage() {
        System.out.println("The message was delivered");
    }
}
