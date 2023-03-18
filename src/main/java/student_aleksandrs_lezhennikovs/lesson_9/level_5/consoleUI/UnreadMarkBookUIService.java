package student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.UnreadMarkBookService;

import java.util.Scanner;

public class UnreadMarkBookUIService implements UIActions {
    private UnreadMarkBookService unreadMarkBookService;

    public UnreadMarkBookUIService(UnreadMarkBookService unreadMarkBookService) {
        this.unreadMarkBookService = unreadMarkBookService;
    }

    @Override
    public void execute() {
        System.out.println("Mark book as Unread using bookID:");
        Scanner input = new Scanner(System.in);
        long bookId = input.nextLong();
        unreadMarkBookService.unreadMarkBook(bookId);
    }
}
