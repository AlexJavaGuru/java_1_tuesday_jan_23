package student_anastasiia_bokareva.lesson7.level7;

public class WordServiceTest {
    public static void main(String[] args) {
        WordService word = new WordService();
        String text = "I feel I do I ";
        String newText = word.findMostFrequentWord(text);
        System.out.println(newText);
    }
}

