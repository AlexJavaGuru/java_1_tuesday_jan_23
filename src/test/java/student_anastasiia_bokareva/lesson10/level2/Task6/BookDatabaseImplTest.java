package student_anastasiia_bokareva.lesson10.level2.Task6;

import org.junit.jupiter.api.Test;
import student_anastasiia_bokareva.lesson10.level3.AuthorSearchCriteria;
import student_anastasiia_bokareva.lesson10.level3.SearchCriteria;

import javax.xml.parsers.SAXParser;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookDatabaseImplTest {

    @Test
    void save() {
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book = new Book("Stail", "DD");
        long id = impl.save(book);
        long idExpected = 1l;
        assertEquals(id, idExpected);

    }

    @Test
    void delete() {
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book1 = new Book("Stail", "DD");
        long id = impl.save(book1);
        boolean real = impl.delete(id);
        boolean expected = true;
        assertEquals(real, expected);
    }

    @Test
    void deleteByBook() {
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book = new Book("Stail", "DD");
        impl.save(book);
        boolean real = impl.delete(book);
        boolean expected = false;
        assertEquals(expected, real);
    }

    @Test
    void findByBookId() {
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book = new Book("Stail", "DD");
        impl.save(book);
        Optional<Book> opti = impl.findById(1l);
        Optional<Book> expectedResult = Optional.of(book);
        assertArrayEquals(new Optional[]{opti}, new Optional[]{expectedResult});
    }

    @Test
    void findByBookAuthor() {
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book = new Book("HR", "Allay");
        Book book1 = new Book("HR", "Wayy");
        Book book2 = new Book("Yte", "Aks");
        impl.save(book);
        impl.save(book1);
        impl.save(book2);
        List<Book> realResult = impl.findByAuthor("HR");
        List<Book> expected = new ArrayList<>();
        expected.add(book);
        expected.add(book1);
        assertEquals(expected, realResult);
    }

    @Test
    void findBookByTitle() {
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book = new Book("HRw", "Allay");
        Book book1 = new Book("HRe", "Allay");
        Book book2 = new Book("Yte", "Aks");
        impl.save(book);
        impl.save(book1);
        impl.save(book2);
        List<Book> realResult = impl.findByTitle("Allay");
        List<Book> expected = new ArrayList<>();
        expected.add(book);
        expected.add(book1);
        assertEquals(expected, realResult);
    }

    @Test
    void counterAllBooks() {
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book = new Book("HRw", "Allay");
        Book book1 = new Book("HRe", "Allay");
        Book book2 = new Book("Yte", "Aks");
        impl.save(book);
        impl.save(book1);
        impl.save(book2);
        int real = impl.countAllBooks();
        int expect = 3;
        assertEquals(real, expect);
    }

    @Test
    void deleteBookByAuthor() {
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book = new Book("HRw", "Allay");
        Book book1 = new Book("HRe", "Allay");
        Book book2 = new Book("Yte", "Aks");
        impl.save(book);
        impl.save(book1);
        impl.save(book2);
        impl.deleteByAuthor("HRw");
        List<Book> realResult = impl.findByAuthor("HRw");
        List<Book> expected = new ArrayList<>();
        assertEquals(expected, realResult);

    }

    @Test
    void deleteBookByTitle() {
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book = new Book("HRe", "Allay");
        Book book1 = new Book("HRwe", "Allay");
        Book book2 = new Book("Yte", "Aks");
        impl.save(book);
        impl.save(book1);
        impl.save(book2);
        impl.deleteByTitle("Aks");
        List<Book> realResult = impl.findByTitle("Aks");
        List<Book> expected = new ArrayList<>();
        assertEquals(expected, realResult);

    }

    @Test
    void checkSearchCriteria() {
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book = new Book("HRe", "Allay");
        Book book1 = new Book("HRe", "All3eay");
        Book book2 = new Book("Yte", "Aks");
        impl.save(book);
        impl.save(book1);
        impl.save(book2);
        List<Book> real = impl.find(new AuthorSearchCriteria("HRe"));
        List<Book> expect = new ArrayList<>();
        expect.add(book);
        expect.add(book1);
        assertEquals(real, expect);

    }

    @Test
    void findUniqueAuthors() {
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book = new Book("HRe", "Allay");
        Book book1 = new Book("HRe", "All3eay");
        Book book2 = new Book("Yte", "Aks");
        impl.save(book);
        impl.save(book1);
        impl.save(book2);
        Set<String> real = impl.findUniqueAuthors();
        Set<String> expect = new HashSet<>();
        expect.add(book.getAuthor());
        expect.add(book1.getAuthor());
        expect.add(book2.getAuthor());
        assertEquals(real, expect);

    }

    @Test
    void findUniqueTitle() {
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book = new Book("HRe", "Allay");
        Book book1 = new Book("HRe", "All3eay");
        Book book2 = new Book("Yte", "Aks");
        impl.save(book);
        impl.save(book1);
        impl.save(book2);
        Set<String> real = impl.findUniqueTitles();
        Set<String> expect = new HashSet<>();
        expect.add(book.getTitle());
        expect.add(book1.getTitle());
        expect.add(book2.getTitle());
        assertEquals(real, expect);
    }

    @Test
    void findUniqueBook() {
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book = new Book("HRe", "Allay", "1900");
        Book book1 = new Book("HRe", "Allay", "1900");
        Book book2 = new Book("Yte", "Aks", "1900");
        impl.save(book);
        impl.save(book1);
        impl.save(book2);
        Set<Book> real = impl.findUniqueBooks();
        Set<Book> expect = new HashSet<>();
        expect.add(book);
        expect.add(book2);
        assertEquals(real, expect);
    }

    @Test
    void contains() {
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book = new Book("HRe", "Allay");
        Book book1 = new Book("HRe", "Ay");
        Book book2 = new Book("Yte", "Aks");
        impl.save(book);
        impl.save(book1);
        impl.save(book2);
        Book check = new Book("HRe", "Allay");
        boolean real = impl.contains(check);
        boolean expect = true;
        assertEquals(real, expect);
    }

    @Test
    void getAuthorToBookMap() {
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book = new Book("HRe", "Allay");
        Book book1 = new Book("HRe", "Ay");
        Book book2 = new Book("Yte", "Aks");
        impl.save(book);
        impl.save(book1);
        impl.save(book2);
        Map<String, List<Book>> real = impl.getAuthorToBooksMap();
        Map<String, List<Book>> expect = new HashMap<>();
        expect.put("HRe", new ArrayList<>());
        expect.put("Yte", new ArrayList<>());
        expect.get("HRe").add(book);
        expect.get("HRe").add(book1);
        expect.get("Yte").add(book2);
        assertEquals(real, expect);
    }

    @Test
    void getEachAuthorBookCounter(){
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book = new Book("HRe", "Allay");
        Book book1 = new Book("HRe", "Ay");
        Book book2 = new Book("Yte", "Aks");
        impl.save(book);
        impl.save(book1);
        impl.save(book2);
        Map<String, Integer> real = impl.getEachAuthorBookCount();
        Map<String, Integer> expect = new HashMap<>();
        expect.put("HRe", 2);
        expect.put("Yte",1);
        assertEquals(real,expect);

    }




}
