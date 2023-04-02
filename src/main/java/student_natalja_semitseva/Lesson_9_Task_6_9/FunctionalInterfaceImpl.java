package student_natalja_semitseva.Lesson_9_Task_6_9;

public class FunctionalInterfaceImpl implements FunctionalInterface{


    @Override
    public void sort(Product product) {

    }

    @Override
    public Product findByName(String productName) {
        return null;
    }
}

//у интерфейса нет тело.
//в интерфейс нет конструктора
// возможно множественное наследование
//Функциональный интерфейс может иметь несколько статических методов и методов по умолчанию с реализацией,
// а также дополнительный абстрактный метод. Чтобы пометить интерфейс как функциональный, используется аннотация @FunctionalInterface.
// Она нужна, чтобы избежать ошибочного объявления дополнительных методов.
// либо использовать предопределенные функциональные интерфейсы Java.