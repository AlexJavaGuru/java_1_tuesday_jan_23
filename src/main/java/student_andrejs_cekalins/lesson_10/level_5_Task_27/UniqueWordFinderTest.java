package student_andrejs_cekalins.lesson_10.level_5_Task_27;

import java.util.Objects;
import java.util.Set;

public class UniqueWordFinderTest {
    public static void main(String[] args) {
        UniqueWordFinderTest test = new UniqueWordFinderTest();
        test.uniqueWordsFinder();
        test.notUniqueWordsFinder();
    }
    public void uniqueWordsFinder(){
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String text = "I have a dog, my dog is a good friend";
        Set<String> expectedResult = Set.of("i", "a", "have", "dog", "my", "is", "good", "friend");
        Set<String> realResult = uniqueWordFinder.find(text);
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("Unique words test Passed");
        }
    }
    public void notUniqueWordsFinder(){
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String text = "I have a dog, my dog is a good friend";
        Set<String> expectedResult = Set.of("i", "a", "have", "dog", "my","dod", "is", "good", "friend");
        Set<String> realResult = uniqueWordFinder.find(text);
        if (!Objects.equals(realResult, expectedResult)) {
            System.out.println("Not unique words test Passed");
        }
    }
}
