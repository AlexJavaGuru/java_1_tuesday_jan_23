package student_romualds_leitans.lesson_3.level_7;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone Samsung = new Phone("Samsung", "A300",true);
        System.out.println("Name: " + Samsung.name);
        System.out.println("Model: " + Samsung.model);
        System.out.println("Sensor display: " + Samsung.sensor);

        Samsung.charge();
        Samsung.work();
        Samsung.turnon();
    }
}
