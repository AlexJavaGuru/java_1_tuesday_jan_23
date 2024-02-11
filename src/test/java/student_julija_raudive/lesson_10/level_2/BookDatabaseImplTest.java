package student_julija_raudive.lesson_10.level_2;

import org.junit.jupiter.api.*;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookDatabaseImplTest {

    private static BookDatabaseImpl bookDatabase;


    @BeforeAll
    static void beforeAll() {
        bookDatabase = new BookDatabaseImpl();
        Book harryPotter1 = new Book("J. K. Rowling", "Harry Potter 1");
        Book harryPotter2 = new Book("J. K. Rowling", "Harry Potter 2");
        Book harryPotter3 = new Book("J. K. Rowling", "Harry Potter 3");
        Book theShining = new Book("Stephen King", "The Shining");
        Book it = new Book("Stephen King", "It");
        bookDatabase.save(harryPotter1);
        bookDatabase.save(harryPotter2);
        bookDatabase.save(harryPotter3);
        bookDatabase.save(theShining);
        bookDatabase.save(it);


    }

    @BeforeEach
    void setUp() {

    }


    @Test
    void testDeleteById() {
        boolean result = bookDatabase.delete(1L);
        boolean result2 = bookDatabase.delete(38L);
        assertTrue(result);
        assertFalse(result2);
    }

    @Test
    void testDelete() {
        Book harryPotter4 = new Book("J. K. Rowling", "Harry Potter 4");
        Book harryPotter5 = new Book("J. K. Rowling", "Harry Potter 5");
        bookDatabase.save(harryPotter4);
        boolean result = bookDatabase.delete(harryPotter4);
        boolean result2 = bookDatabase.delete(harryPotter5);
        assertTrue(result);
        assertFalse(result2);
    }


    @Test
    @Order(7)
    void findById() {
        Book theGreatGatsby = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        bookDatabase.save(theGreatGatsby);
        Optional<Book> result = bookDatabase.findById(6L);
        Optional<Book> expected = Optional.of(theGreatGatsby);
        assertEquals(expected, result);

        Optional<Book> resultNull = bookDatabase.findById(20L);
        Optional<Book> expectedNull = Optional.empty();
        assertEquals(expectedNull, resultNull);

    }

    @Test
    void findByAuthor() {
        List<Book> result = bookDatabase.findByAuthor("Stephen King");
        List<Book> expected = new ArrayList<>();
        expected.add(bookDatabase.findById(4L).get());
        expected.add(bookDatabase.findById(5L).get());
        assertEquals(expected, result);

    }

    @Test
    void findByTitle() {
        List<Book> result = bookDatabase.findByTitle("Harry Potter 3");
        List<Book> expected = new ArrayList<>();
        expected.add(bookDatabase.findById(3L).get());
        assertEquals(expected, result);
    }

    @Test
    @Order(1)
    void countAllBooks() {
        int result = bookDatabase.countAllBooks();
        int expected = 5;
        assertEquals(expected, result);
    }


    @Test
    void deleteByAuthor() {
        Book thePickwickPapers = new Book("Charles Dickens", "The Pickwick Papers");
        Book oliverTwist = new Book("Charles Dickens", "Oliver Twist");
        bookDatabase.save(thePickwickPapers);
        bookDatabase.save(oliverTwist);
        bookDatabase.deleteByAuthor("Charles Dickens");
        assertThat(thePickwickPapers).isNotIn(bookDatabase.bookList);
        assertThat(oliverTwist).isNotIn(bookDatabase.bookList);

    }

    @Test
    void deleteByTitle() {
        Book thePickwickPapers = new Book("Charles Dickens", "The Pickwick Papers");
        bookDatabase.save(thePickwickPapers);
        bookDatabase.deleteByTitle("The Pickwick Papers");
        assertThat(thePickwickPapers).isNotIn(bookDatabase.bookList);
    }

    @Test
    void testFind() {
       SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("J. K. Rowling");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Harry Potter 3");

        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        List<Book> andResult = bookDatabase.find(searchCriteria);
        List<Book> andExpected = new ArrayList<>();
        andExpected.add(bookDatabase.findById(3L).get());
        assertEquals(andExpected, andResult);

        SearchCriteria searchCriteria2 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        List<Book> orResult = bookDatabase.find(searchCriteria2);
        List<Book> orExpected = new ArrayList<>();
        orExpected.add((bookDatabase.findById(1L).get()));
        orExpected.add((bookDatabase.findById(2L).get()));
        orExpected.add((bookDatabase.findById(3L).get()));
        assertEquals(orExpected, orResult);

    }

    @Test
    @Order(2)
    void findUniqueAuthors() {
        Set<String> result = new HashSet<>(bookDatabase.findUniqueAuthors());
        Set<String> expected = new HashSet<>();
        expected.add("Stephen King");
        expected.add("J. K. Rowling");
        assertEquals(expected, result);

    }

    @Test
    @Order(3)
    void findUniqueTitles() {
        Set<String> result = new HashSet<>(bookDatabase.findUniqueTitles());
        Set<String> expected = new HashSet<>();
        expected.add("The Shining");
        expected.add("Harry Potter 1");
        expected.add("Harry Potter 2");
        expected.add("Harry Potter 3");
        expected.add("It");
        assertEquals(expected, result);
    }

    @Test
    @Order(4)
    void findUniqueBooks() {
        Set<Book> result = new HashSet<>(bookDatabase.findUniqueBooks());
        Set<Book> expected = new HashSet<>();
        expected.add(new Book("Stephen King", "It"));
        expected.add(new Book("J. K. Rowling", "Harry Potter 3"));
        expected.add(new Book("Stephen King", "The Shining"));
        expected.add(new Book("J. K. Rowling", "Harry Potter 2"));
        expected.add(new Book("J. K. Rowling", "Harry Potter 1"));
        assertEquals(expected.hashCode(), result.hashCode());

    }

    @Test
    void contains() {
        boolean result = bookDatabase.contains(new Book("Stephen King", "The Shining"));
        assertTrue(result);
        boolean result2 = bookDatabase.contains(new Book("J. K. Rowling", "Harry Potter 4"));
        assertFalse(result2);

    }

    @Test
    @Order(5)
    void testGetAuthorToBooksMap() {
        Map<String, List<Book>> result;
        result = bookDatabase.getAuthorToBooksMap();
        Map<String, List<Book>> expected = new HashMap<>();
        expected.put("Stephen King", new ArrayList<>() {
            {
                add(bookDatabase.bookList.get(3));
                add(bookDatabase.bookList.get(4));
            }
        });
        expected.put("J. K. Rowling", new ArrayList<>() {
            {
                add(bookDatabase.bookList.get(0));
                add(bookDatabase.bookList.get(1));
                add(bookDatabase.bookList.get(2));
            }
        });
        assertEquals(expected, result);
    }

    @Test
    @Order(6)
    void testGetEachAuthorBookCount() {
        Map<String, Integer> result;
        result = bookDatabase.getEachAuthorBookCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Stephen King", 2);
        expected.put("J. K. Rowling", 3);
        assertEquals(expected, result);
    }
}