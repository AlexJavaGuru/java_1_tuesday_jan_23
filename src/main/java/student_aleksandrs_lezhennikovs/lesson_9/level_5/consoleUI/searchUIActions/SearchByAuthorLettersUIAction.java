package student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.searchUIActions;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.UIActions;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.UtilitiesUI;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.searchServices.SearchByAuthorLettersService;

import java.util.Scanner;

public class SearchByAuthorLettersUIAction implements UIActions {
    private SearchByAuthorLettersService searchByAuthorLettersService;
    private UtilitiesUI utilitiesUI = new UtilitiesUI();

    public SearchByAuthorLettersUIAction(SearchByAuthorLettersService searchByAuthorLettersService) {
        this.searchByAuthorLettersService = searchByAuthorLettersService;
    }

    @Override
    public void execute() {
        System.out.println("Input searching part of authors name please:");
        Scanner input = new Scanner(System.in);
        String authorPart = input.nextLine();
        utilitiesUI.printBookList(searchByAuthorLettersService.searchByAuthorLetters(authorPart));
    }
}
