package student_julija_raudive.lesson_9.level_3;

//Функциональный интерфейс — это интерфейс, который содержит один абстрактный метод без тела (код метода подается при вызове этого метода).
// Static и default методов может быть сколько угодно.

@FunctionalInterface
interface functionalInterfaceExample {
    int numberManipulation(int a);
}

class Task6 {

    public static void main(String[] args) {
        int b = 8;
        functionalInterfaceExample example = (int a) -> a + a;
        int result = example.numberManipulation(b);
        System.out.println(result);

        functionalInterfaceExample example2 = (int a) -> a * a;
        result = example2.numberManipulation(b);
        System.out.println(result);
    }

}
