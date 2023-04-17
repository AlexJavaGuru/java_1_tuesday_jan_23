package student_oksana_tarasova.lesson_11.level_1;

public class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe(3333, 1000.00);
        safe.amountOfMoney = 0.0;
        safe.pinCode = 1112;
        System.out.println(safe.toString());
        safe.paymentTransaction();
    }
}
