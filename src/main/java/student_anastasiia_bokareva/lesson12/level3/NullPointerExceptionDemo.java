package student_anastasiia_bokareva.lesson12.level3;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String text = null;
        System.out.println(text.toString());
    }
}
// NullPointerException: Cannot invoke "String.toString()" because "text" is null
// выбрасывается когда ссыдка параметра null