package student_andrejs_cekalins.lesson_11.level_1.Task_5;

public class Safe2Demo {
    public static void main(String[] args) {
        Safe2 safe2 = new Safe2();
        System.out.println("Need to put money in the safe");
        System.out.println("");
        safe2.putMoneyInTheSafe(2221,1200.01);
        System.out.println(safe2);
        safe2.putMoneyInTheSafe(2220,1111.56);
        System.out.println("");
        System.out.println("Now need to get money from safe");
        System.out.println("");
        safe2.getMoneyFromTheSafe(2221, -200.01);
        System.out.println(safe2);
        safe2.getMoneyFromTheSafe(2220, -200.01);
        System.out.println(safe2);
    }
}
