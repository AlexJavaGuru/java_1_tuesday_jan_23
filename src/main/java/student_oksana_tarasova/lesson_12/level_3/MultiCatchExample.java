package student_oksana_tarasova.lesson_12.level_3;

public class MultiCatchExample {

    public static void main(String[] args) {
        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {
        }
    }
}

/*
Подклассы исключений должны следовать перед любым из их суперклассов,
иначе суперкласс будет перехватывать эти исключения.
 */