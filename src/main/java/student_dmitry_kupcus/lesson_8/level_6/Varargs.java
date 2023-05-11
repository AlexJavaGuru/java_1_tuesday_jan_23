package student_dmitry_kupcus.lesson_8.level_6;

public class Varargs {
    public static void main(String... args) {
        print("Hi!", "How", "are", "you?", ":)");
    }
    static void print(String... words) {
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
