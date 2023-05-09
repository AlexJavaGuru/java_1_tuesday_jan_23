package student_anastasiia_bokareva.lesson10.level2.Task6;

import org.junit.jupiter.api.Test;

import javax.xml.parsers.SAXParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        assertEquals(real,expected);
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
    void findByBookId(){
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book = new Book("Stail", "DD");
        impl.save(book);
        Optional<Book> opti = impl.findById(1l);
        Optional<Book> expectedResult = Optional.of(book);
        assertArrayEquals(new Optional[]{opti}, new Optional[]{expectedResult});
    }
    @Test
    void findByBookAuthor(){
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book = new Book("HR","Allay");
        Book book1 = new Book("HR", "Wayy");
        Book book2 = new Book("Yte","Aks");
        impl.save(book);
        impl.save(book1);
        impl.save(book2);
        List<Book> realResult = impl.findByAuthor("HR");

        assertEquals(expected, realResult);
    }
}
