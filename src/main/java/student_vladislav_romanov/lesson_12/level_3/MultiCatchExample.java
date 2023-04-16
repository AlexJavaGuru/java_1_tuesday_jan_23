package student_vladislav_romanov.lesson_12.level_3;

public class MultiCatchExample {

    public static void main(String[] args) {
        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {

        }
    }

    // Первым стоит расположить исключение-потомка, а лишь потом исключение-родителя.
    // В противном случае будет срабатывать лишь исключение-родитель.

}
