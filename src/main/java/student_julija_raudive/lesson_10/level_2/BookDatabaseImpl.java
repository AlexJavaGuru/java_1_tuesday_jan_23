package student_julija_raudive.lesson_10.level_2;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

 public class BookDatabaseImpl implements BookDatabase {

    List<Book> bookList = new ArrayList<>();

    private static final AtomicInteger count = new AtomicInteger(0);


    @Override
    public Long save(Book book) {
        bookList.add(book);
        book.setId((long) count.incrementAndGet());
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (Book book1 : bookList) {
            if (book1.equals(book)) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> listByAuthor = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                listByAuthor.add(book);
            }
        }
        return listByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> listByTitle = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                listByTitle.add(book);
            }
        }
        return listByTitle;
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getAuthor().equals(author)) {
                delete(bookList.get(i));
                i--;
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
                delete(bookList.get(i));
                i--;
            }
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> list = new ArrayList<>();
        for (Book book : bookList) {
            if (searchCriteria.match(book)) {
                list.add(book);
            }
        }
        return list;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> uniqueAuthorList = new HashSet<>();
        for (Book book : bookList) {
            uniqueAuthorList.add(book.getAuthor());
        }
        return uniqueAuthorList;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uniqueTitleList = new HashSet<>();
        for (Book book : bookList) {
            uniqueTitleList.add(book.getTitle());
        }
        return uniqueTitleList;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> uniqueBookList = new HashSet<>();
        for (Book book : bookList) {
            uniqueBookList.add(new Book(book.getAuthor(), book.getTitle()));
        }
        return uniqueBookList;
    }

    @Override
    public boolean contains(Book book) {
       SearchCriteria searchByAuthor = new AuthorSearchCriteria(book.getAuthor());
       SearchCriteria searchByTitle = new TitleSearchCriteria(book.getTitle());
      SearchCriteria searchCriteria = new AndSearchCriteria(searchByAuthor, searchByTitle);
        for (Book ignored : bookList) {
            if (searchCriteria.match(ignored)) {
                return true;
            }
        }
        return false;

    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> map = new HashMap<>();
        for (Book book : bookList) {
            List<Book> list = new ArrayList<>();
            map.put(book.getAuthor(), list);
            for (Book book1 : bookList) {
                if (book1.getAuthor().equals(book.getAuthor())) {
                    list.add(book1);
                }
            }
        }
        return map;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> map = new HashMap<>();
        for (Book book : bookList) {
            int bookCount = 0;
            map.put(book.getAuthor(), bookCount);
            for (Book book1 : bookList) {
                if (book1.getAuthor().equals(book.getAuthor())) {
                    bookCount++;
                    map.put(book.getAuthor(), bookCount);
                }
            }
        }
        return map;
    }


    @Override
    public String toString() {
        return "BookDatabaseImpl{" +
                "bookList=" + bookList +
                '}';
    }
}
