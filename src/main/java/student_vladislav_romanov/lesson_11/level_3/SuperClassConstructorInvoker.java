package student_vladislav_romanov.lesson_11.level_3;

public class SuperClassConstructorInvoker {

    public SuperClassConstructorInvoker() {
        super(); // Вызов конструктора родителя должен всегда быть первым
        System.out.println(1);
        System.out.println(2);
    }

}
