package student_andrejs_cekalins.lesson_11.level_1.Task_4;

public class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe(0000, 200.50);
        safe.getMoney();
        safe.getPin();
        safe.setPin(0000);
        safe.setMoney(200.50);
    }
}
