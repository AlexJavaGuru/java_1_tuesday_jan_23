package student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.MarkBookAsReadService;

import java.util.Scanner;

public class MarkBookAsReadUIAction implements UIActions {
    private MarkBookAsReadService markBookAsReadService;

    public MarkBookAsReadUIAction(MarkBookAsReadService markBookAsReadService) {
        this.markBookAsReadService = markBookAsReadService;
    }

    @Override
    public void execute() {
        System.out.println("Mark book as read using bookID:");
        Scanner input = new Scanner(System.in);
        long bookId = input.nextLong();
        markBookAsReadService.markBookAsRaed(bookId);
    }
}
