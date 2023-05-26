package student_ilya_tihonov.lesson_12.level_3;

public class NullPointerExceptionDemo {

    public static void main(String[] args) {
        String str = null;
        int length = str.length(); // NullPointerException возникает здесь, так как str является null и пытаемся вызвать метод length() на нулевой ссылке.
    }

}
