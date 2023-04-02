package student_vladislav_romanov.lesson_10.bookDatabase.core;

import student_vladislav_romanov.lesson_10.bookDatabase.search.SearchCriteria;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase {

    List<Book> books = new ArrayList<>();

    @Override
    public Long save(Book book) {
        long id = books.size() != 0 ? books.get(books.size() - 1).getId() + 1 : 1;
        book.setId(id);
        books.add(book);
        return id;
    }

    @Override
    public boolean delete(Long bookId) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getId().equals(bookId)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book bookFromList = iterator.next();
            if (bookFromList.equals(book)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> list = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                list.add(book);
            }
        }
        return list;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> list = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                list.add(book);
            }
        }
        return list;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        books.removeIf(book -> book.getAuthor().toLowerCase().contains(author.toLowerCase()));
    }

    @Override
    public void deleteByTitle(String title) {
        books.removeIf(book -> book.getTitle().toLowerCase().contains(title.toLowerCase()));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> list = new ArrayList<>();
        for (Book book : books) {
            if (searchCriteria.match(book)) {
                list.add(book);
            }
        }
        return list;
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria, int paging) {
        int pageSize = 3;
        int pageId = 1;
        int resultCounter = 0;
        Map<Integer, List<Book>> pagedResult = new TreeMap<>();
        List<Book> list = new ArrayList<>();

        for (Book book : books) {
            if (searchCriteria.match(book)) {
                list.add(book);
                resultCounter++;
                pagedResult.put(pageId, list);
            }
            if (resultCounter == pageSize) {
                resultCounter = 0;
                pageId++;
                list = new ArrayList<>();
            }
        }

        return pagedResult.get(paging);
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> authors = new HashSet<>();
        for (Book book : books) {
            authors.add(book.getAuthor());
        }
        return authors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> titles = new HashSet<>();
        for (Book book : books) {
            titles.add(book.getTitle());
        }
        return titles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> uniqueBooks = new HashSet<>();
        for (Book book : books) {
            uniqueBooks.add(new Book(book.getAuthor(), book.getTitle(), book.getYearOfIssue()));
        }
        return uniqueBooks;
    }

    @Override
    public boolean contains(Book requestedBook) {
        for (Book book : books) {
            if (book.getTitle().equals(requestedBook.getTitle()) &&
                    book.getAuthor().equals(requestedBook.getAuthor()) &&
                    book.getYearOfIssue().equals(requestedBook.getYearOfIssue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorToBook = new HashMap<>();
        Set<String> authors = findUniqueAuthors();
        for (String author : authors) {
            authorToBook.put(author, findByAuthor(author));
        }
        return authorToBook;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> authorBookCount = new HashMap<>();
        Set<String> authors = findUniqueAuthors();
        Set<Book> uniqueBooks = findUniqueBooks();
        for (String author : authors) {
            int bookCount = 0;
            for (Book uniqueBook : uniqueBooks) {
                if( uniqueBook.getAuthor().equals(author)) {
                    bookCount++;
                }
            }
            authorBookCount.put(author, bookCount);
        }
        return authorBookCount;
    }

    @Override
    public String toString() {
        return "BookDatabaseImpl{" +
                "books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDatabaseImpl that = (BookDatabaseImpl) o;
        return books.equals(that.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }
}
