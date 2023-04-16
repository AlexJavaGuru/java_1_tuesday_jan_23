package student_oksana_tarasova.Lesson_9.level_3;

@FunctionalInterface
public interface TwoNumbers {
    int actionsWithTwoNumbers(int firstNumber, int secondNumber);
}

/*
Функциональный интерфейс - это интерфейс, в котором есть только один абстрактный метод.
Статистических методов и методов по умолчанию может быть любое количество.
Создавать функциональный интерфейс нужно используя аннотацию @FunctionalInterface,
это сигнал для компилятора. При создании еще одного абстрактного метода, компилятор выдаст
предупреждение, что этот интерфейс не может содержать более одного абстрактного метода.
Для реализации метода, определенного в функциональном интерфейсе, используется лямбда-выражение.
Лямбда строится так: (параметры) -> (код метода)
Пример использования функционального интерфейса приведен в классе MathematicalOperations.

 */