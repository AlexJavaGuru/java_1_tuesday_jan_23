package student_ilya_tihonov.lesson_10.BookLibraryApplication.bookd_database;

import student_ilya_tihonov.lesson_10.BookLibraryApplication.book.Book;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.search.SearchCriteria;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase {

    private List<Book> books = new ArrayList<>();
    private Long nextId = 1L;

    private List<Book> bookList = new ArrayList<>();


    public Long save(Book book) {
        book.setId(nextId++);
        books.add(book);
        return book.getId();
    }

    public boolean delete(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    public boolean delete(Book book) {
        for (int i = 0; i < bookList.size(); i++) {
            Book currentBook = bookList.get(i);
            if (currentBook.equals(book)) {
                bookList.remove(i);
                return true;
            }
        }
        return false;
    }

    public Optional<Book> findById(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public int countAllBooks() {
        return books.size();
    }

    public boolean deleteByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.remove(book);
                return true;
            }
        }
        return false;
    }

    public boolean deleteByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                result.remove(book);
                return true;
            }
        }
        return false;
    }

    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> results = new ArrayList<>();

        for (Book book : books) {
            if (searchCriteria.match(book)) {
                results.add(book);
            }
        }

        return results;
    }

    public Set<String> findUniqueAuthors() {
        Set<String> uniqueAuthors = new HashSet<>();

        for (Book book : books) {
            uniqueAuthors.add(book.getAuthor());
        }

        return uniqueAuthors;
    }

    public Set<String> findUniqueTitles(){
        Set<String> uniqueTitles = new HashSet<>();

        for (Book book : books) {
            uniqueTitles.add(book.getTitle());
        }

        return uniqueTitles;
    }

    public boolean contains(Book book) {
        return books.contains(book);
    }

    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorToBooksMap = new HashMap<>();

        for (Book book : books) {
            String author = book.getAuthor();
            List<Book> authorBooks = authorToBooksMap.getOrDefault(author, new ArrayList<>());
            authorBooks.add(book);
            authorToBooksMap.put(author, authorBooks);
        }

        return authorToBooksMap;
    }

   public Map<String, Integer> getEachAuthorBookCount(){
       Map<String, Integer> authorBookCountMap = new HashMap<>();

       for (Book book : books) {
           String author = book.getAuthor();
           authorBookCountMap.put(author, authorBookCountMap.getOrDefault(author, 0) + 1);
       }

       return authorBookCountMap;
    }



}
