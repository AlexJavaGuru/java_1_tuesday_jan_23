package student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.searchUIActions;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.UIActions;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.UtilitiesUI;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.searchServices.SearchByAuthorService;

import java.util.Scanner;

public class SearchByAuthorUIAction implements UIActions {
    private SearchByAuthorService searchByAuthorService;
    private UtilitiesUI utilitiesUI = new UtilitiesUI();

    public SearchByAuthorUIAction(SearchByAuthorService searchByAuthorService) {
        this.searchByAuthorService = searchByAuthorService;
    }

    @Override
    public void execute() {
        System.out.println("Input searching author please:");
        Scanner input = new Scanner(System.in);
        String author = input.nextLine();
        utilitiesUI.printBookList(searchByAuthorService.searchByAuthor(author));
    }
}
