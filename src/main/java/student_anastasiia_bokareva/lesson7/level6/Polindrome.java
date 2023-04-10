package student_anastasiia_bokareva.lesson7.level6;

public class Polindrome {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(String text) {
        String string = text.toLowerCase();
        char[] chars = string.toCharArray();
        int lenght = chars.length - 1;
        for (int i = 0; i < (lenght / 2); i++) {
            if (chars[i] != chars[lenght]) {
                return false;
            }
            lenght = lenght - 1;
        }
        return true;
    }
}