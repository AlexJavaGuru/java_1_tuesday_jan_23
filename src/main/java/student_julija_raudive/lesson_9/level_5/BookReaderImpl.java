package student_julija_raudive.lesson_9.level_5;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



class BookReaderImpl implements BookReader {

    List<Book> bookList;


    public BookReaderImpl() {
        this.bookList = new ArrayList<>();
    }


    @Override
    public boolean addBook(Book book) {
        if (!isDuplicate(book) && bookDataIsOk(book)) {
            bookList.add(book);
            return true;
        } else
            return false;
    }

    @Override
    public boolean bookDataIsOk(Book book) {
        return bookTitleIsOk(book) && bookAuthorIsOk(book);
    }

    @Override
    public boolean deleteBook(Book book) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).equals(book)) {
                bookList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<String> displayBookList() {
        List<String> displayList = new ArrayList<>();
        for (Book book : bookList) {
            displayList.add("Book " + book.getTitle() + " [" + book.getAuthor() + "]");
        }
        return displayList;
    }

    @Override
    public List<String> findBookByAuthor(String author) {
        List<String> listByAuthor = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().matches(author + ".*")) {
                listByAuthor.add("Book " + book.getTitle() + " [" + book.getAuthor() + "]");
            }
        }
        return listByAuthor;

    }

    @Override
    public List<String> findBookByTitle(String title) {
        List<String> listByTitle = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().matches(title + ".*")) {
                listByTitle.add("Book " + book.getTitle() + " [" + book.getAuthor() + "]");
            }
        }
        return listByTitle;
    }

    @Override
    public boolean markAsRead(Book book) {

        for (Book value : bookList) {
            if (value.equals(book)) {
                return book.isRead = true;
            }
        }
        return book.isRead = false;
    }

    @Override
    public boolean markAsUnread(Book book) {
        for (Book value : bookList) {
            if (value.equals(book)) {
                book.isRead = false;
                return true;
            }
        }
        return false;
    }

    @Override
    public List<String> displayFinishedBookList() {
        List<String> finishedBookList = new ArrayList<>();
        for (Book book : bookList) {
            if(book.isRead){
                finishedBookList.add("Book " + book.getTitle() + " [" + book.getAuthor() + "]");
            }
        }
        return finishedBookList;
    }

    @Override
    public List<String> displayUnreadBookList() {
        List<String> unreadBookList = new ArrayList<>();
        for (Book book : bookList) {
            if(!book.isRead){
                unreadBookList.add("Book " + book.getTitle() + " [" + book.getAuthor() + "]");
            }
        }
        return unreadBookList;
    }

    private boolean bookAuthorIsOk(Book book) {
        return !book.author.equals("");
    }

    private boolean bookTitleIsOk(Book book) {
        return !book.title.equals("");
    }

    public boolean isDuplicate(Book book) {

        for (Book bookEntity : bookList) {
            if (Objects.equals(bookEntity.title, book.title) && Objects.equals(bookEntity.author, book.author)) {
                return true;
            }
        }
        return false;
    }
}
