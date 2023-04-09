package student_aleksandrs_lezhennikovs.lesson_10.level_2.consolu_ui;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.AuthorSearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.SearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.DeleteBookService;

import java.io.IOException;
import java.util.Scanner;

public class DeleteByAuthorUIAction implements UIAction {
    private DeleteBookService deleteBookService;

    public DeleteByAuthorUIAction(DeleteBookService deleteBookService) {
        this.deleteBookService = deleteBookService;
    }


    @Override
    public void execute() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Input author to delete books");
        String author = input.nextLine();
        SearchCriteria searchCriteria = new AuthorSearchCriteria(author);
        if(deleteBookService.execute(searchCriteria)) {
            System.out.println("Book was deleted");
        } else {
            System.out.println("Books not found and NOT deleted");
        }
    }
}
