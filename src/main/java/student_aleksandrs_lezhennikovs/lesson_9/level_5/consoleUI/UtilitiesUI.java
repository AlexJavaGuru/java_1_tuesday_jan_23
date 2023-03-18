package student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;

import java.util.List;

class UtilitiesUI {
    public void printBookList(List<BookEntity> booksList) {
        System.out.println("Your list of books:");
        for (int i = 0; i < booksList.size(); i++) {
            System.out.println(specialFormat(booksList.get(i)));
        }
    }

    private String specialFormat(BookEntity book) {
        return book.getTitle() + " [" + book.getAuthor() + "]";
    }
}
