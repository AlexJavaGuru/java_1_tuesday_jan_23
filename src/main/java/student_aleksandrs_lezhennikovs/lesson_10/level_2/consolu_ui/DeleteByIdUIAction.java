package student_aleksandrs_lezhennikovs.lesson_10.level_2.consolu_ui;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.IdSearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.SearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.DeleteBookService;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {
    private DeleteBookService deleteBookByIdService;

    public DeleteByIdUIAction(DeleteBookService deleteBookByIdService) {
        this.deleteBookByIdService = deleteBookByIdService;
    }

    @Override
    public void execute() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input book's ID");
        Long bookId = input.nextLong();
        SearchCriteria searchCriteria = new IdSearchCriteria(bookId);
        if (deleteBookByIdService.execute(searchCriteria)) {
            System.out.println("Book was deleted!");
        } else {
            System.out.println("Book not found and not be deleted!");
        }
    }
}
