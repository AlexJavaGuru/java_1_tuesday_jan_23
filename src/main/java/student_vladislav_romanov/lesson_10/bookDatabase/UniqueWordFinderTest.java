package student_vladislav_romanov.lesson_10.bookDatabase;

import student_vladislav_romanov.TestUtil;

import java.util.Set;

class UniqueWordFinderTest extends TestUtil {

    public static void main(String[] args) {
        UniqueWordFinderTest uniqueWordFinderTest = new UniqueWordFinderTest();
        uniqueWordFinderTest.uniqueWordFinderTestSucceed();
        uniqueWordFinderTest.uniqueWordFinderTestFailed();
        uniqueWordFinderTest.printStat();
    }

    public void uniqueWordFinderTestSucceed() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();

        String text = "Hello Java world. Java world is amazing. All around the world uses Java.";

        Set<String> expected = Set.of("all", "amazing", "around", "hello", "java", "is", "the", "uses", "world");

        Set<String> current = uniqueWordFinder.find(text);

        printResult(current.containsAll(expected), "uniqueWordFinderTestSucceed");
    }

    public void uniqueWordFinderTestFailed() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();

        String text = "Hello Java world. Java world is amazing. All around the world uses Java.";

        Set<String> expected = Set.of("all", "amazing", "around", "uses", "world", "guru", "language");

        Set<String> current = uniqueWordFinder.find(text);

        printResult(!current.containsAll(expected), "uniqueWordFinderTestFailed");
    }

}
