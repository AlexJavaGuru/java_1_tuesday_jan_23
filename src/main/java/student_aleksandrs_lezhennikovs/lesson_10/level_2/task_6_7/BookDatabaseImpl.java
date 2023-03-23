package student_aleksandrs_lezhennikovs.lesson_10.level_2.task_6_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {
    private Long id = 1L;
    private List<Book> storage = new ArrayList<>();


    @Override
    public Long save(Book book) {
        return id++;
    }

    @Override
    public void saveBook(Book book) {
        book.setId(save(book));
        storage.add(book);
    }

    @Override
    public boolean delete(Long id) {
        Book book = findBookByID(id).get();
        storage.remove(book);
        return true;
    }

    @Override
    public String toString() {
        return "BookDatabaseImpl{" +
                "id=" + id +
                ", storage=" + storage +
                '}';
    }

    private Optional<Book> findBookByID(Long id) {
        for (Book book : storage) {
            Optional<Book> optBook = Optional.ofNullable(book);
            if (optBook.isPresent()) {
                if (book.getId().equals(id)) {
                    return optBook;
                }
            }
        }
        return Optional.empty();
    }
}
