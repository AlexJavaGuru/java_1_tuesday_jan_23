package student_ilya_tihonov.lesson_12.level_3;

//В представленном коде возникает ошибка компиляции,
// так как catch блоки должны быть расположены в порядке
// наследования исключений, от наиболее специфичных к наиболее общим.
// В данном случае, catch (ArithmeticException a) должен быть
// расположен перед catch (Exception e).

public class MultiCatchExample {

    public static void main(String[] args) {
        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {

        }
    }

}
