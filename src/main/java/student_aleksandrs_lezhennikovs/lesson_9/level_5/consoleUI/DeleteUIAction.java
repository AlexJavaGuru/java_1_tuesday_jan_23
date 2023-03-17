package student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.DeleteService;

import java.util.Scanner;

public class DeleteUIAction implements UIActions{
    private DeleteService deleteService;

    public DeleteUIAction(DeleteService deleteService) {
        this.deleteService = deleteService;
    }

    @Override
    public void execute() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input book Title for delete");
        String title = input.nextLine();
        System.out.println("Input book Author for delete");
        String author = input.nextLine();
        BookEntity book = new BookEntity(title, author);
        deleteBookUI(book);
    }

    private void deleteBookUI(BookEntity book) {
        if (deleteService.checkBookBeforeDelete(book)) {
            System.out.println("Not exist book!");
        } else {
            deleteService.deleteBook(book);
            System.out.println("Book was deleted!");
        }
    }
}
