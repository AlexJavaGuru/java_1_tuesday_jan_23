package student_anastasiia_bokareva.lesson11.level1;

public class Demo {
    public static void main(String[] args) {
        Safe safe = new Safe(121, 1230);
        safe.addMoney(500);
        System.out.println(safe.getAmountOfMoney());
        safe.changePassword(10);
        System.out.println(safe.getPassword());

    }
}
