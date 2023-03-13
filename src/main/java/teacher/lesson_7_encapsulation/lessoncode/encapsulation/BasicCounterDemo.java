package teacher.lesson_7_encapsulation.lessoncode.encapsulation;

public class BasicCounterDemo {

    public static void main(String[] args) {
        BasicCounter counter = new BasicCounter();

        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println(counter.getValue());

        counter.setCounterValue(-100);

        System.out.println(counter.getValue());
    }
}
