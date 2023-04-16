package student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;

import java.util.List;

public class UtilitiesUI {
    public void printBookList(List<BookEntity> booksList) {
        for (int i = 0; i < booksList.size(); i++) {
            System.out.println(specialFormat(booksList.get(i)));
        }
    }
    public void printBookListFullInfo(List<BookEntity> booksList) {
        for (int i = 0; i < booksList.size(); i++) {
            System.out.println(fullFormat(booksList.get(i)));
        }
    }

    private String specialFormat(BookEntity book) {
        return book.getTitle() + " [" + book.getAuthor() + "]";
    }
    private String fullFormat(BookEntity book) {
        String isRead = readUnreadText(book.getIsRead());
        return "[" + book.getBookId() + "] "  +
                " [" + book.getTitle() + "] " +
                " [" + book.getAuthor() + "] " +
                " [" + isRead + "]";
    }

    private String readUnreadText(boolean isRead) {
        if (isRead) {
            return "Book is read";
        } else {
            return "Unread";
        }
    }
}
