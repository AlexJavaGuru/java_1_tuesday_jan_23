package student_oksana_tarasova.lesson_11.level_1;

public class Safe2Demo {
    public static void main(String[] args) {
        Safe2 safe2 = new Safe2(1111, 1000.0);
        System.out.println(safe2.getAmountOfMoney());
        safe2.putMoney(1111, 200.0);
        System.out.println(safe2.getAmountOfMoney());
        safe2.putMoney(1233, 200.0);
        safe2.getMoney(1111, 2000.0);
        safe2.getMoney(1231, 2000.0);
        safe2.getMoney(1111, 100.0);
        System.out.println(safe2.getAmountOfMoney());
    }
}
