package student_anastasiia_bokareva.lesson11.level1;

public class Demo2 {
    public static void main(String[] args) {
        Safe2 safe = new Safe2(121, 1230);
        safe.putNoney(121, 170);
        System.out.println(safe.getAmountOfMoney());
        safe.getMoney(121, 100);
        System.out.println(safe.getAmountOfMoney());

    }
}

